package academy.devdojo.maratonajava.javacore.Kenum.test;


import academy.devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jorge", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Marcio", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente1);


    }
}
