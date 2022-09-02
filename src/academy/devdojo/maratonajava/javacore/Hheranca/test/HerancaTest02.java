package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
        // 1 - bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
        // 2 - alocado espaço em memória para o objeto da superclasse
        // 3 - cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
        // 4 - bloco de inicialização da superclasse é executado na ordem em que aparece
        // 5 - construtor é executado da superclasse

        // 6 - alocado espaço em memória para o objeto da subclasse
        // 7 - cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
        // 8 - bloco de inicialização da subclasse é executado na ordem em que aparece
        // 9 - construtor é executado da subclasse

        Funcionario funcionario = new Funcionario("Guilherme");
    }
}
