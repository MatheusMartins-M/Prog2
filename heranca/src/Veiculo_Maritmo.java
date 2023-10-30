public class Veiculo_Maritmo extends Veiculo{
    String codigo, empresa;

    public Veiculo_Maritmo(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor);

        this.codigo = codigo;
        this.empresa = empresa;

    }

    static void compra(){

    }

    public void Info(){
        super.Info();
        System.out.println("Código: "+ this.codigo);
        System.out.println("Empresa: "+ this.empresa);
    }
}
