package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        System.out.println(args);
        Calculadora c = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};
        c.somaArray(numeros);

        c.somaVarArgs(1, 2, 3, 4, 5);
    }
}
