public class Veiculo_Aereo extends Veiculo{
    String codigo, empresa;
    int posicao_Z;

    public Veiculo_Aereo(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa, int posicao_Z){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor);

        this.codigo = codigo;
        this.empresa = empresa;
        this.posicao_Z = posicao_Z;

    }
    static void deslocamento(){

    }
    static void compra(){

    }

    public void Info(){
        super.Info();
        System.out.println("Código: "+ this.codigo);
        System.out.println("Empresa: "+ this.empresa);
        System.out.println("Posição Z: "+ this.posicao_Z);
    }
}
