package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        c.alteraDoisNumeros(num1, num2);
        System.out.println("dentro da classe test04\n");
        System.out.println(num1);
        System.out.println(num2);


    }
}
