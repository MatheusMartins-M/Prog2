public class Helicoptero extends Veiculo_Aereo{
    int rotores;

    public Helicoptero(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa, int posicao_Z, int rotores){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor, codigo, empresa, posicao_Z);

        this.rotores = rotores;

    }
    public void Info() {
        super.Info();
        System.out.println("Número de rotores: "+ this.rotores);
    }
}
