import java.util.Scanner;

public class Pessoa {
    String nome_Completo, CPF, telefone, email;

    public Pessoa(String nome_Completo, String CPF, String telefone, String email){
        this.nome_Completo = nome_Completo;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    }

    public void altera_contatos(){
        Scanner teclado = new Scanner(System.in);

        String tel_novo, email_novo;

        System.out.print("Digite o novo número: ");
        tel_novo = teclado.nextLine();

        System.out.print("Digite o novo email: ");
        email_novo = teclado.nextLine();

        altera_contatos(tel_novo, email_novo);
    }
    public void altera_contatos(String tel_novo, String email_novo){
        this.email = email_novo;
        this.telefone = tel_novo;
    }

    public void infoPessoa(){
        System.out.println();
        System.out.println("Nome: "+ this.nome_Completo);
        System.out.println("CPF: "+ this.CPF);
        System.out.println("Contato: "+ this.telefone + " / "+ this.email);

    }

}
