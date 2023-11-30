import java.util.Scanner;
public class Livro {
    String titulo, editora, area, codigoFilial;
    int codigoLivro, ano, quantidadeEstoque;
    double valor;

    public Livro(String codigoFilial) {
        Scanner teclado = new Scanner(System.in);

        this.codigoFilial = codigoFilial;

        System.out.print("Título: ");
        this.titulo = teclado.nextLine();

        System.out.print("Editora: ");
        this.editora = teclado.nextLine();

        System.out.print("Área: ");
        this.area = teclado.nextLine();

        System.out.print("Código: ");
        this.codigoLivro = teclado.nextInt();

        System.out.print("Ano de lançamento: ");
        this.ano = teclado.nextInt();

        System.out.print("Valor: ");
        this.valor = teclado.nextDouble();

        System.out.print("Quantidade em estoque: ");
        this.quantidadeEstoque = teclado.nextInt();
    }

    public Livro(String codigoFilial, String titulo, String editora, String area, int codigoLivro, int ano, double valor, int quantidadeEstoque) {
        this.codigoFilial = codigoFilial;
        this.titulo = titulo;
        this.editora = editora;
        this.area = area;
        this.codigoLivro = codigoLivro;
        this.ano = ano;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double calculaValor() {
        return valor * quantidadeEstoque;
    }
    public void info() {
        System.out.println();
        System.out.println(this.codigoFilial);
        System.out.println(">>>>> Cod#" + this.codigoLivro);
        System.out.println("Título/Editora: " + this.titulo + "/" + this.editora);
        System.out.println("Categoria: " + this.area);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Valor: R$%.2f \n", this.valor);
        System.out.println("Estoque: " + this.quantidadeEstoque);
        System.out.printf("Valor total em estoque: R$%.2f \n", calculaValor());

    }
}
