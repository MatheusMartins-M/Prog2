import java.util.ArrayList;

public class Entregador extends Pessoa{
    String empresa;
    ArrayList <Entrega> listaEntregas = new ArrayList<>();
    public Entregador(String nome_Completo, String CPF, String telefone, String email, String empresa) {
        super(nome_Completo, CPF, telefone, email);
        this.empresa = empresa;
    }


    public void aloca_entrega(Entrega entrega){
        listaEntregas.add(entrega);
    }

    public void info() {
        System.out.println();
        for (Entrega buscaInfos : listaEntregas) {
            if (buscaInfos.entregador.nome_Completo.equals(nome_Completo)) {
                System.out.println("Nome completo: " + buscaInfos.cliente.nome_Completo);
                System.out.println("CPF: " + buscaInfos.cliente.CPF);
                System.out.println("Empresa: " + this.empresa);
                System.out.println("<<<<<<<<<< Entregas Alocadas >>>>>>>>>>");

                for (Entrega buscaEntregas : listaEntregas) {
                    System.out.println("Entrega #" + buscaEntregas.cod_entrega);
                    System.out.println("Endereço: " + buscaEntregas.cliente.endereco_completo);
                    System.out.println("Situação: " + buscaEntregas.situacao);
                    System.out.println();
                }
            }
        }
    }
}
