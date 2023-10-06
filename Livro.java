import java.util.Scanner;
public class Livro {
    String titulo, editora, area;
    int codigo, ano, quantidadeEstoque;
    double valor;

    public Livro(){
        Scanner teclado  = new Scanner(System.in);

        System.out.print("Título: ");
        this.titulo = teclado.nextLine();

        System.out.print("Editora: ");
        this.editora = teclado.nextLine();

        System.out.print("Área: ");
        this.area = teclado.nextLine();

        System.out.print("Código: ");
        this.codigo = teclado.nextInt();

        System.out.print("Ano de lançamento: ");
        this.ano = teclado.nextInt();

        System.out.print("Valor: ");
        this.valor = teclado.nextDouble();

        System.out.print("Quantidade em estoque: ");
        this.quantidadeEstoque = teclado.nextInt();

    }
    public double calculaValor(){
        double calculo;

        calculo = valor * quantidadeEstoque;

        return calculo;

    }
    public void info(){
        System.out.println(">>>>> Cod#"+ this.codigo);
        System.out.println("Título/Editora: "+ this.titulo +"/"+ this.editora);
        System.out.println("Categoria: "+ this.area);
        System.out.println("Ano: "+ this.ano);
        System.out.printf("Valor: R$%.2f \n", this.valor);
        System.out.println("Estoque: "+ this.quantidadeEstoque);
        System.out.printf("Valor total em estoque: R$%.2f \n", calculaValor());
        System.out.println();
    }
}