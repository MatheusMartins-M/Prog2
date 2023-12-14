public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Maria", "123456789", "51985002401", "maria@gmail.com");
        Pessoa pessoa2 = new Pessoa("Seu Zé", "84798456587974", "5132612977", "seuze@gmail.com");

        pessoa1.infoPessoa();
        pessoa1.altera_contatos();

        pessoa1.infoPessoa();
        pessoa2.infoPessoa();

        Cliente cliente1 = new Cliente(pessoa1.nome_Completo, pessoa1.CPF, pessoa1.telefone, pessoa1.email, "9874", "Rua dos Andradas, 183");
        Cliente cliente2 = new Cliente(pessoa2.nome_Completo, pessoa2.CPF, pessoa2.telefone, pessoa2.email, "91780-890", "Rua Rubem Pereira Torelly, 315");


        cliente1.infoCliente();
        cliente2.infoCliente();

        cliente2.altera_endereco();
        cliente2.infoCliente();

        Entregador entregador1 = new Entregador("Jose", "741852963", "51986682552", "jose@BurguerMix.com.br", "Burguer Mix");
        Entregador entregador2 = new Entregador("Robertin", "0848498465416", "51999784125", "robertin@TPS.com.br", "Tudo Pelo Social");
        Entrega entrega1 = new Entrega(1, "a caminho", cliente1, entregador1);
        Entrega entrega2 = new Entrega(2, "a caminho", cliente1, entregador1);
        Entrega entrega3 = new Entrega(3, "a caminho", cliente2, entregador2);
        Entrega entrega4 = new Entrega(4, "a caminho", cliente2, entregador2);

        entrega1.infoEntrega();
        entrega1.atualiza_situacao();

        entrega2.infoEntrega();
        entrega3.infoEntrega();

        entrega4.infoEntrega();
        entrega4.atualiza_situacao();

        entregador1.aloca_entrega(entrega1);
        entregador1.aloca_entrega(entrega3);
        entregador2.aloca_entrega(entrega2);
        entregador2.aloca_entrega(entrega4);

        entregador1.info();
        entregador2.info();
        
    }
}