package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Gui";
        nomes[1] = "Clara";
        nomes[2] = "Cris";
        nomes[3] = "";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];

    }
}
