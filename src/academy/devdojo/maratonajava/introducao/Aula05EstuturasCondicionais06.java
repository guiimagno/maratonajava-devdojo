package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais06 {
    public static void main(String[] args) {

        int dia = 7;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Util");
                break;

            default:
                System.out.println("Inválido");
                break;
        }
    }
}
