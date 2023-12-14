import java.util.Scanner;

public class Entrega {
    int cod_entrega;
    Entregador entregador;
    Cliente cliente;
    String situacao;

    public Entrega(int cod_entrega, String situacao, Cliente cliente, Entregador entregador){
        this.cod_entrega = cod_entrega;
        this.situacao = situacao;
        this.cliente = cliente;
        this.entregador = entregador;
    }
    public void atualiza_situacao(){
        Scanner teclado = new Scanner(System.in);
        String nova_situacao;

        System.out.print("Qual a situação da entrega: ");
        nova_situacao = teclado.nextLine();

        atualiza_situacao(nova_situacao);
    }
    public void atualiza_situacao(String nova_situacao){
        this.situacao = nova_situacao;
    }
    public void infoEntrega(){
        System.out.println();
        System.out.println("Entrega/Situação : "+ this.cod_entrega +" / "+ this.situacao);
        System.out.println("Entregador/Empresa: "+ entregador.nome_Completo +" / "+ entregador.empresa);
        System.out.println("Endereço: "+ cliente.endereco_completo);
        System.out.println("Nome cliente e CPF: "+ cliente.nome_Completo + " /  "+ cliente.CPF);
    }
}
