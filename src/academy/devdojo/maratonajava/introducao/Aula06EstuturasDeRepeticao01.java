package academy.devdojo.maratonajava.introducao;

public class Aula06EstuturasDeRepeticao01 {
    public static void main(String[] args) {

        int count = 11;

        while(count < 10){
            System.out.println(count);
            count++;
        }

        count = 0;
        do{
            System.out.println("dentro do do-while " + ++count);

        }while (count < 10);

        for (int i=0; i <= 1000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
