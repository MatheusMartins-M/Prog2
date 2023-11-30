import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList <Livro> cadastroLivros = new ArrayList <>();
    static ArrayList <Filial> cadastroFiliais = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    static int escolha = -1;
    static String linha;
    static boolean arquivoAtt = false;
    public static void main(String[] args) throws Exception {
        while (escolha != 0){
            mostraMenu();
            escolha = teclado.nextInt();
            System.out.println();

            switch (escolha){
                case 1 -> cadastraNovoLivro();
                case 2 -> cadastraNovaFilial();
                case 3 -> listaLivros();
                case 4 -> listaFiliais();
                case 5 -> listagemEmEstoque();
                case 6 -> buscaNome();
                case 7 -> buscaCategoria();
                case 8 -> buscaPreco();
                case 9 -> buscaEstoque();
                case 10 -> buscaCodigo();
                case 11 -> valorEstoque();
                case 12 -> carregarEstoque();
                case 13 -> atualizaArquivoEstoque();
                case 0 -> encerraTudo();
                default -> System.out.println("\nOpção inválida. Tente novamente\n");
            }
        }
    }
    static void mostraMenu(){
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<<<<<");
        System.out.println("1 - Cadastrar novo livro");
        System.out.println("2 - Cadastrar nova filial");
        System.out.println("3 - Listar livros");
        System.out.println("4 - Listar Filiais");
        System.out.println("5 - Listagem em Estoque");
        System.out.println("6 - Buscar livros por nome");
        System.out.println("7 - Buscar livros por categoria");
        System.out.println("8 - Buscar livros por preço");
        System.out.println("9 - Buscar livros por quantidade em estoque");
        System.out.println("10 - Buscar livros por código");
        System.out.println("11 - Valor total em estoque");
        System.out.println("12 - Carregar estoque");
        System.out.println("13 - Atualizar arquivo de estoque");
        System.out.println("0 - Encerrar atividades");
        System.out.print("Escolha: ");
    }

    static void cadastraNovoLivro() {
        String codigoFilial;

        System.out.print("Código da Filial: ");
        teclado.nextLine();
        codigoFilial = teclado.nextLine();

        boolean codigoFilialValido;

        do {
            codigoFilialValido = false;

            for (Filial filial : cadastroFiliais) {
                if (filial.codigo.equals(codigoFilial)) {
                    codigoFilialValido = true;
                    break;
                }
            }

            if (!codigoFilialValido) {
                System.out.println("Filial não encontrada.");
                System.out.println("Crie uma nova filial.");
                System.out.println();

                cadastraNovaFilial();

            }

        } while (!codigoFilialValido);

        System.out.println();

        Livro novoLivro = new Livro(codigoFilial);
        cadastroLivros.add(novoLivro);

        System.out.println();
        System.out.println("Livro cadastrado com sucesso!");
    }

    static void cadastraNovaFilial() {
        String codigoFilial;
        boolean codigoExistente;

        do {
            System.out.print("Código da filial: ");
            codigoFilial = teclado.nextLine();

            codigoExistente = false;

            for (Filial buscaRepetido : cadastroFiliais) {
                if (buscaRepetido.codigo.equals(codigoFilial)) {
                    System.out.println("Código já existente. Escolha outro código.");
                    codigoExistente = true;
                    break;
                }
            }

        } while (codigoExistente);

        Filial novaFilial = new Filial(codigoFilial);
        cadastroFiliais.add(novaFilial);

        System.out.println();
        System.out.println("Filial cadastrada com sucesso!");
    }
    static void listaLivros(){
        if(cadastroLivros.size() == 0){
            System.out.println("Não existem livros cadastrados!!");

        }else {

            for (Livro cadastros : cadastroLivros) {
                cadastros.info();
            }
        }
    }
    static void listaFiliais(){
        if(cadastroFiliais.size() == 0){
            System.out.println("Não existem filiais cadastrados!!");

        }else {

            for (Filial cadastros : cadastroFiliais) {
                cadastros.info();
            }
        }
    }
    static void listagemEmEstoque() {
        String filial;
        double valorTotalEstoque = 0;

        System.out.println("Qual filial você gostaria de acessar?");
        System.out.print("Filial: ");
        teclado.nextLine();
        filial = teclado.nextLine();
        System.out.println();

        for(Filial buscaFilial : cadastroFiliais){
            if(filial.equals(buscaFilial.codigo)){
                for (Livro buscaLivro : cadastroLivros) {
                    if (filial.equals(buscaLivro.codigoFilial)) {
                        buscaLivro.info();
                        valorTotalEstoque += buscaLivro.calculaValor();
                    }
                }
            }
        }

        System.out.printf("\nO valor total do estoque da filial #FL"+ filial +" é de: %.2f", valorTotalEstoque);
        System.out.println();
    }


    static void buscaNome() {
        String nomeLivro, filial;

        System.out.println("Qual filial você gostaria de acessar?");
        System.out.print("Filial: ");
        teclado.nextLine();
        filial = teclado.nextLine();
        System.out.println();


        for (Filial buscaFilial : cadastroFiliais) {
            if (filial.equals(buscaFilial.codigo)) {

                System.out.println("Qual o nome do livro que você está procurando?");
                System.out.print("Livro: ");
                nomeLivro = teclado.nextLine();

                for (Livro buscaNome : cadastroLivros) {
                    if (nomeLivro.equals(buscaNome.titulo) && filial.equals(buscaNome.codigoFilial)) {
                        buscaNome.info();
                    }
                }
            }
        }
    }

    static void buscaCategoria(){
        String nomeCategoria, filial;

        System.out.println("Qual filial você gostaria de acessar?");
        System.out.print("Filial: ");
        teclado.nextLine();
        filial = teclado.nextLine();
        System.out.println();


        for (Filial buscaFilial : cadastroFiliais) {
            if (filial.equals(buscaFilial.codigo)) {

                System.out.println("Qual a categoria do livro que você está procurando?");
                System.out.print("Categoria: ");
                nomeCategoria = teclado.nextLine();

                for (Livro buscaCategoria : cadastroLivros) {
                    if (nomeCategoria.equals(buscaCategoria.area) && filial.equals(buscaCategoria.codigoFilial)) {
                        buscaCategoria.info();
                    }
                }
            }
        }
    }
    static void buscaPreco() {
        int preco;
        String filial;

        System.out.println("Qual filial você gostaria de acessar?");
        System.out.print("Filial: ");
        teclado.nextLine();
        filial = teclado.nextLine();
        System.out.println();


        for (Filial buscaFilial : cadastroFiliais) {
            if (filial.equals(buscaFilial.codigo)) {

                System.out.println("Qual o máximo de preço que deseja pagar no livro? ");
                System.out.print("Preço: ");
                preco = teclado.nextInt();

                for (Livro buscaPreco : cadastroLivros) {
                    if (preco > buscaPreco.valor && filial.equals(buscaPreco.codigoFilial)) {
                        buscaPreco.info();
                    }
                }
            }
        }
    }
    static void buscaEstoque(){
        int minEstoque;
        String filial;

        System.out.println("Qual filial você gostaria de acessar?");
        System.out.print("Filial: ");
        teclado.nextLine();
        filial = teclado.nextLine();
        System.out.println();

        for (Filial buscaFilial : cadastroFiliais) {
            if(filial.equals(buscaFilial.codigo)) {

                System.out.println("Qual o valor mínimo de estoque?");
                System.out.print("Estoque: ");
                minEstoque = teclado.nextInt();

                for (Livro buscaEstoque : cadastroLivros) {
                    if (minEstoque < buscaEstoque.quantidadeEstoque && filial.equals(buscaEstoque.codigoFilial)) {
                        buscaEstoque.info();
                    }
                }
            }
        }
    }
    static void buscaCodigo() {
        int codigo;

        System.out.println("Qual é o código do livro que você gostaria de buscar?");
        System.out.print("Código: ");
        codigo = teclado.nextInt();
        System.out.println();

        boolean livroEncontrado = false;

        for (Filial filial : cadastroFiliais) {
            for (Livro buscaLivro : cadastroLivros) {
                if (codigo == buscaLivro.codigoLivro && buscaLivro.codigoFilial.equals(filial.codigo)) {
                    if (!livroEncontrado) {
                        System.out.println(">>>>> Cod#" + buscaLivro.codigoLivro);
                        System.out.println("Título/Editora: " + buscaLivro.titulo + "/" + buscaLivro.editora);
                        System.out.println("Categoria: " + buscaLivro.area);
                        System.out.println("Ano: " + buscaLivro.ano);
                        livroEncontrado = true;
                    }

                    System.out.printf("Valor: R$%.2f >>> Filial %s, estoque: %d unidades\n", buscaLivro.valor, filial.nomeFilial, buscaLivro.quantidadeEstoque);
                }
            }
        }

        if (livroEncontrado) {
            double valorTotalEstoque = 0;

            for (Livro buscaLivro : cadastroLivros) {
                if (codigo == buscaLivro.codigoLivro) {
                    valorTotalEstoque += buscaLivro.calculaValor();
                }
            }
            System.out.printf("Valor total em estoque: R$%.2f\n", valorTotalEstoque);

        } else {

            System.out.println("Livro não encontrado.");
        }
    }

    static void carregarEstoque() throws Exception {
        FileInputStream arquivo = new FileInputStream("src/carregar.txt");
        Scanner Texto = new Scanner(arquivo);

        String codigoFilial = null, titulo, area, editora, nomeFilial, enderecoFilial, contatoFilial;
        int codigoLivro, ano, quantidadeEstoque;
        double valor;
        boolean filialExiste;
        boolean livroExiste;

        while (Texto.hasNextLine()) {
            linha = Texto.nextLine();
            String[] SL = linha.split(",");
            String[] infoFilial = linha.split(",");

            if (linha.startsWith("#FL")) {
                codigoFilial = infoFilial[0].replace("#FL", "");
                filialExiste = false;

                for (Filial filial : cadastroFiliais) {
                    if (filial.codigo.equals(codigoFilial)) {
                        filialExiste = true;
                        break;
                    }
                }

                if (!filialExiste) {
                    nomeFilial = infoFilial[1];
                    enderecoFilial = infoFilial[2];
                    contatoFilial = infoFilial[3];

                    Filial novaFilial = new Filial(codigoFilial, nomeFilial, enderecoFilial, contatoFilial);
                    cadastroFiliais.add(novaFilial);
                }

            } else {

                codigoLivro = Integer.parseInt(SL[0]);
                livroExiste = false;

                for (Livro livro : cadastroLivros) {
                    if (livro.codigoLivro == codigoLivro && livro.codigoFilial.equals(codigoFilial)) {
                        livroExiste = true;
                        break;
                    }
                }

                if (!livroExiste) {
                    titulo = SL[1];
                    ano = Integer.parseInt(SL[2]);
                    area = SL[3];
                    editora = SL[4];
                    valor = Double.parseDouble(SL[5].replace("R$", ""));
                    quantidadeEstoque = Integer.parseInt(SL[6]);

                    Livro livro = new Livro(codigoFilial, titulo, editora, area, codigoLivro, ano, valor, quantidadeEstoque);
                    cadastroLivros.add(livro);
                }
            }
        }

        System.out.println("Estoque carregado com sucesso!!");
    }


    static void valorEstoque(){
        double calculoTotal = 0;

        for(Livro valorTotal : cadastroLivros){
            calculoTotal += valorTotal.calculaValor();
        }

        System.out.printf("O valor total do estoque é: R$%.2f\n", calculoTotal);
    }
    static void atualizaArquivoEstoque() throws Exception {
        FileWriter arquivo = new FileWriter("src/carregar.txt");

        for (Filial filial : cadastroFiliais) {
            arquivo.write("#FL" + filial.codigo + "," + filial.nomeFilial + "," + filial.enderecoFilial + "," + filial.contatoFilial + "\n");

            for (Livro atualiza : cadastroLivros) {
                if (atualiza.codigoFilial.equals(filial.codigo)) {
                    arquivo.write(atualiza.codigoLivro + "," + atualiza.titulo + "," + atualiza.ano + "," + atualiza.area + "," + atualiza.editora + ", R$" + atualiza.valor + "," + atualiza.quantidadeEstoque + "\n");
                }
            }
        }

        System.out.println("O arquivo foi atualizado!!!");
        arquivoAtt = true;

        arquivo.close();
    }

    static void encerraTudo() throws Exception {
        int opcao;

        if(arquivoAtt == true){
            System.out.println("Programa encerrado!");
            escolha = 0;

        }else {

            System.out.println("Você gostaria de atualizar o estoque?");
            System.out.println("1) Sim");
            System.out.println("2) Não");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            System.out.println();

            switch (opcao) {
                case 1 -> {
                    atualizaArquivoEstoque();
                    System.out.println("Programa encerrado!");
                }
                case 2 -> {
                    System.out.println("Programa encerrado!");
                    escolha = 0;
                }
                default -> System.out.println("\nOpção inválida. Tente novamente\n");
            }
        }
    }

}