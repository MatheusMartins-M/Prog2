import java.util.Scanner;
public class Veiculo {
    Scanner teclado = new Scanner(System.in);
    String fabricante, modelo, pais;
    int passageiros, posicao_X, posicao_Y;
    double valor;

    public Veiculo(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pais = pais;
        this.passageiros = passageiros;
        this.posicao_X = posicao_X;
        this.posicao_Y = posicao_Y;
        this.valor = valor;
    }

    //public deslocamento(){
    //}

    public void Info(){
        System.out.println("Fabricante: "+ this.fabricante +" / Modelo: "+ this.modelo);
        System.out.println("País: "+ this.pais);
        System.out.println("Número de passageiros: "+ this.passageiros);
        System.out.println("Posição X: "+ this.posicao_X + " / Posição Y: "+ this.posicao_Y);
        System.out.println("Valor: "+ this.valor);
    }
}

