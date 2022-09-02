package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class Herancatest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("52050123");

        Pessoa pessoa = new Pessoa("marcelo");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();


        Funcionario funcionario = new Funcionario("guilherme");
        funcionario.setCpf("000000000000");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200.0);

        funcionario.imprime();

    }
}
