package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Guilherme Magno");
        pessoa.setIdade(22);

        System.out.println(pessoa.getNome()+ "\n"+ pessoa.getIdade());
//        pessoa.imprime();

    }
}
