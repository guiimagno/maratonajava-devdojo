package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        extracted();
    }

    private static String extracted() {
        try {
            System.out.println("abrindo arquivo");
            System.out.println("escrevendo arquivo");
            return "conexao aberta";
        } catch (Exception e) {
            System.out.println("fechando recurso do arquivo");
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso do arquivo");

        }
        return null;
    }
}
