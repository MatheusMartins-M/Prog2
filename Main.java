import java.io.FileInputStream;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList <Livro> cadastroLivros = new ArrayList <>();
    static Scanner teclado = new Scanner(System.in);
    static int escolha = -1;
    static String linha;
    public static void main(String[] args) throws Exception{
        FileInputStream arquivo = new FileInputStream("src/carregar.txt");
        Scanner entradaTexto = new Scanner (arquivo);
        linha = entradaTexto.nextLine();


        while (escolha != 0){
            mostraMenu();
            escolha = teclado.nextInt();
            System.out.println();

            switch (escolha){
                case 1 -> cadastraNovo();
                case 2 -> listaLivros();
                case 3 -> buscaNome();
                case 4 -> buscaCategoria();
                case 5 -> buscaPreco();
                case 6 -> buscaEstoque();
                case 7 -> valorEstoque();
                case 8 -> carregarEstoque();
                case 0 -> encerraTudo();
                default -> System.out.println("\nOpção inválida. Tente novamente\n");
            }
        }

    }
    static void mostraMenu(){
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<<<<<");
        System.out.println("1 - Cadastrar novo livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Buscar livros por nome");
        System.out.println("4 - Buscar livros por categoria");
        System.out.println("5 - Buscar livros por preço");
        System.out.println("6 - Buscar livros por quantidade em estoque");
        System.out.println("7 - Valor total em estoque");
        System.out.println("8 - Carregar estoque");
        System.out.println("0 - Encerrar atividades");
        System.out.print("Escolha: ");
    }

    static void cadastraNovo(){
        cadastroLivros.add(new Livro());

    }
    static void listaLivros(){
        for (Livro cadastros : cadastroLivros) {
            cadastros.info();
        }
    }
    static void buscaNome(){
        String nomeLivro;

        System.out.print("Insira o nome do livro: ");
        nomeLivro = teclado.nextLine();
        nomeLivro = teclado.nextLine();
        System.out.println();

        for(Livro buscaLivro : cadastroLivros){
            if(nomeLivro.equals(buscaLivro.titulo)){
                buscaLivro.info();

            }
        }

        System.out.println();
    }
    static void buscaCategoria(){
        String nomeCategoria;

        System.out.print("Insira a categoria desejada: ");
        nomeCategoria = teclado.nextLine();
        nomeCategoria = teclado.nextLine();
        System.out.println();

        for(Livro buscaCategoria : cadastroLivros){
            if(nomeCategoria.equals(buscaCategoria.area)){
                buscaCategoria.info();

            }
        }

        System.out.println();
    }
    static void buscaPreco(){
        int preco;

        System.out.print("Insira o máximo de valor do livro: ");
        preco = teclado.nextInt();
        System.out.println();

        for(Livro buscaPreco : cadastroLivros){
            if(preco > buscaPreco.valor){
                buscaPreco.info();

            }
        }
    }
    static void buscaEstoque(){
        int minEstoque;

        System.out.print("Insira o valor mínimo de estoque: ");
        minEstoque = teclado.nextInt();

        for(Livro buscaEstoque : cadastroLivros){
            if(minEstoque < buscaEstoque.calculaValor()){
                buscaEstoque.info();
            }
        }
    }
    static void valorEstoque(){
        double calculoTotal = 0;

        for(Livro valorTotal : cadastroLivros){
            calculoTotal += valorTotal.calculaValor();
        }

        System.out.printf("O valor total do estoque é: R$%.2f\n", calculoTotal);
    }
    static void carregarEstoque(){
        String [] SL;

        while(){

            SL = linha.split(",");

        }

    }
    static void encerraTudo(){
        System.out.println("Programa encerrado!");
        escolha = 0;
    }
}