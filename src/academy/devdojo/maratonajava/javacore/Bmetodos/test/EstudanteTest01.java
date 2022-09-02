package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.ImpressaoEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante01 = new Estudante();

        ImpressaoEstudante impressora = new ImpressaoEstudante();

        estudante.nome = "jubileu";
        estudante.idade = 14;
        estudante.sexo = 'F';


        estudante01.nome = "Mário";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante01);
    }
}
