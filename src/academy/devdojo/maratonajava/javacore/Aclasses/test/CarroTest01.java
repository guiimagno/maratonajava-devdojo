package academy.devdojo.maratonajava.javacore.Aclasses.test;

import academy.devdojo.maratonajava.javacore.Aclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.setNome("FUSCA");
        c1.setModelo("SPORT");
        c1.setAno("1991");

        Carro c2 = new Carro();
        c2.setNome("FIAT");
        c2.setModelo("UNO");
        c2.setAno("1800");

        c2 = c1;

        System.out.println(c1.getNome() +" "+ c1.getModelo() +" "+ c1.getAno());
        System.out.println("\n-----------\n");
        System.out.println(c2.getNome() +" "+ c2.getModelo() +" "+ c2.getAno());
    }
}
