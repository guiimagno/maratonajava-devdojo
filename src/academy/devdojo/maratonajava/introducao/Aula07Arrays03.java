package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numero1 = {1, 2, 3, 4};
        int[] numero2 = new int[]{4, 3, 2, 1};

        for (int i = 0; i < numero1.length; i++) {
            System.out.println(numero1[i]);
        }

        for (int num : numero2) {
            System.out.println(num);
        }
    }
}
