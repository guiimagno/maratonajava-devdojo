package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Guilherme");
        Professor professor2 = new Professor("Clara");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Colégio Exito", professores);

        escola.imprime();
    }
}
