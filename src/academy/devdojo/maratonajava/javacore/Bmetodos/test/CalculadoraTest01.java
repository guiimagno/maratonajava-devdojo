package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        c.somarDoisNumeros();
        c.subtrairDoisNumeros();
        c.multiplicaDoisNumeros(10, 5); // dois argumentos


        double result = c.divideDoisNumeros(10, 2);
        System.out.println(result);
        System.out.println(c.divideDoisNumeros(13, 0));
        System.out.println(c.divideDoisNumeros02(20, 0));
        System.out.println("----------------");
        c.imprimeDivideDoisNumeros03(86, 0);
    }
}
