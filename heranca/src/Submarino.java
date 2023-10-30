public class Submarino extends Veiculo_Maritmo{
    int posicao_Z, profundidade_max;

    public Submarino(String fabricante, String modelo, String pais, int passageiros, int posicao_X, int posicao_Y, double valor, String codigo, String empresa, int posisao_Z, int profundidade_max){
        super(fabricante, modelo, pais, passageiros, posicao_X, posicao_Y, valor, codigo, empresa);

        this.posicao_Z = posisao_Z;
        this.profundidade_max = profundidade_max;

    }


    static void deslocamento(){

    }

    public void Info(){
        super.Info();
        System.out.println("Posição Z: "+ this.posicao_Z);
        System.out.println("Profundidade máxima: "+ this.profundidade_max);
    }

}
