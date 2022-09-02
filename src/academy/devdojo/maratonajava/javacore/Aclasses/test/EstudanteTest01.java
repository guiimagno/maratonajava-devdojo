package academy.devdojo.maratonajava.javacore.Aclasses.test;

import academy.devdojo.maratonajava.javacore.Aclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Guilherme";
        estudante.idade = 1;
        estudante.sexo = 'M';

        System.out.println(estudante);
        System.out.println(estudante.nome +" "+ estudante.idade +" "+ estudante.sexo);
    }

}
