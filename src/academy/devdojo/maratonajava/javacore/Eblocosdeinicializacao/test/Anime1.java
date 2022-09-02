package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

public class Anime1 {
    private String nome;
    private int[] espisodios;

    {
        System.out.println("inicialização");
        for (int i = 0; i < espisodios.length; i++) {
            espisodios[i] = i + 1;

            System.out.println(espisodios);
        }
    }

    //    public Anime1(){}
    public Anime1() {
//        espisodios = new int[3];
        System.out.println("construtor ->" + espisodios);
        for (int episodio :
                this.espisodios) {
            System.out.println(episodio + "<- array de episodios ");
        }
        System.out.println();

    }

    public Anime1(int[] espisodios) {
        this.espisodios = espisodios;
    }

    public int[] getEspisodios() {
        return espisodios;
    }

    public Anime1(String nome) {
        this.nome = nome;
    }
}
