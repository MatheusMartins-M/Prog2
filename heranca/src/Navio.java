public class Navio extends Veiculo_Maritmo{
    String nome;

    public Navio(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa, String nome){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor, codigo, empresa);

        this.nome = nome;
    }
    public void Info() {
        super.Info();
        System.out.println("Nome: "+ this.nome);
    }
}
