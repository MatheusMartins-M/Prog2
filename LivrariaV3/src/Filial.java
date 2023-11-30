import java.util.Scanner;

public class Filial {
    String codigo, nomeFilial, enderecoFilial, contatoFilial;

    public Filial(String codigo, String nomeFilial, String enderecoFilial, String contatoFilial){
        this.codigo = codigo;
        this.nomeFilial = nomeFilial;
        this.enderecoFilial = enderecoFilial;
        this.contatoFilial = contatoFilial;

    }

    public Filial(String codigo){
        Scanner teclado = new Scanner(System.in);

        this.codigo = codigo;

        System.out.print("Nome da filial: ");
        this.nomeFilial = teclado.nextLine();

        System.out.print("Endereco da Filial: ");
        this.enderecoFilial = teclado.nextLine();

        System.out.print("Contato da filial: ");
        this.contatoFilial = teclado.nextLine();
    }

    public void info(){
        System.out.println();
        System.out.println("#FL"+ this.codigo);
        System.out.println("Nome: "+ this.nomeFilial);
        System.out.println("Endereço: "+ this.enderecoFilial);
        System.out.println("Contato: "+ this.contatoFilial);

    }
}
