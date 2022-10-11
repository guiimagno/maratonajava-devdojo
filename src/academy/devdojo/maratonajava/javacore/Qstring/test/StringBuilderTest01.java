package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Guilherme Magno";
        nome.concat(" Developer Java");
        System.out.println(nome);

        StringBuilder sb =  new StringBuilder("Guilherme Magno");
        sb.append(" Dev").append(" Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.delete(0, 4);
        System.out.println(sb);
    }
}
