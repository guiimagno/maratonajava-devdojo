package academy.devdojo.maratonajava.javacore.Aclasses.test;

import academy.devdojo.maratonajava.javacore.Aclasses.dominio.Professor;

public class ProfessorTest01 {

    public static void main(String[] args) {

        Professor p = new Professor();
        p.nome = "joao";
        p.idade = 30;
        p.sexo = 'm';

        System.out.println(p.nome);
        System.out.println(p.idade);
        System.out.println(p.sexo);

    }

}
