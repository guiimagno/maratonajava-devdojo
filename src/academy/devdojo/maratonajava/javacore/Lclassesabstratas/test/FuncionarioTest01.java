package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Clara", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme", 10000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
