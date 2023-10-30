public class Veiculo_Terrestre extends Veiculo{
    String placa, dono;

    public Veiculo_Terrestre(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String placa, String dono){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor);
        this.placa = placa;
        this.dono = dono;

    }
    static void emplacamento(){

    }
    static void compra(){

    }

    public void Info(){
        System.out.println(">>>>> Info do veículo de placa: "+ this.placa);
        super.Info();
        System.out.println("Dono: "+ this.dono);
    }
}
