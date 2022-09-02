package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();

        estudante.nome = "jubileu";
        estudante.idade = 14;
        estudante.sexo = 'F';


        estudante01.nome = "Mário";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante.imprime();
        estudante01.imprime();

    }
}
