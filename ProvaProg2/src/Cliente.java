import java.util.Scanner;

public class Cliente extends Pessoa{
    String CEP, endereco_completo;

    public Cliente(String nome_Completo, String CPF, String telefone, String email, String CEP, String endereco_completo) {
        super(nome_Completo, CPF, telefone, email);
        this.CEP = CEP;
        this.endereco_completo = endereco_completo;
    }

    public void altera_endereco(){
        Scanner teclado = new Scanner(System.in);

        String cep_novo, endereco_novo;

        System.out.print("Digite o novo CEP: ");
        cep_novo = teclado.nextLine();

        System.out.print("Digite o novo endereço: ");
        endereco_novo = teclado.nextLine();

        altera_endereco(cep_novo, endereco_novo);
    }
    public void altera_endereco(String cep_novo, String endereco_novo){
        this.CEP = cep_novo;
        this.endereco_completo = endereco_novo;
    }

    public void infoCliente(){
        super.infoPessoa();
        System.out.println("Endereço: "+ this.CEP +" - "+ this.endereco_completo);
    }

}
