public class Aviao extends Veiculo_Aereo{
    int turbinas;
    public Aviao (String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa, int posicao_Z, int turbinas){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor, codigo, empresa, posicao_Z);

        this.turbinas = turbinas;

    }
    public void Info() {
        super.Info();
        System.out.println("Número de turbinas: "+ this.turbinas);
    }
}
