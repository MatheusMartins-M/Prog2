import java.util.Scanner;
public class Carro extends Veiculo_Terrestre{
    Scanner teclado = new Scanner(System.in);
    double combustivel, potencia;
    String modelo;

    public Carro(){
        System.out.println("Digite a capacidade de combustível: ");
        this.combustivel = teclado.nextInt();
    }
}
