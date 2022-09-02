package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    // 0 - bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - alocado espaço em memória para o objeto
    // 2 - cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é executado

    private String nome;
    private static int[] espisodios;

    static {
        System.out.println("dentro do bloco de inicialização");
        espisodios = new int[10];
        for (int i = 0; i < espisodios.length; i++) {
            espisodios[i] = i + 1;
        }
    }


    public Anime() {
        for (int episodio :
                Anime.espisodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
//    public Anime(){
//        System.out.println("dentro do construtor");
//        for (int i = 0; i < espisodios.length; i++) {
//            espisodios[i]= i+1;
//            System.out.println(this.espisodios);
//        }
//    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public int[] getEspisodios() {
        return espisodios;
    }

}
