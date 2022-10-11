package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {

        String nome = " J ubileu Santo s ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("J", "R"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        String numeros = "1234 5";
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 5));
        System.out.println(nome.trim());
    }
}
