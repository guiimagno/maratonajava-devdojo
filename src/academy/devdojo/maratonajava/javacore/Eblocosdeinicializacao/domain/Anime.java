package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.domain;

import javax.security.auth.login.AccountNotFoundException;

public class Anime {
    // 1 - alocado espaço em memória para o objeto
    // 2 - cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicialização é executado
    // 4 - construtor é executado

    private String nome;
    private int[] espisodios = {1, 2, 3};

//    {
//        System.out.println("dentro do bloco de inicialização");
//        espisodios = new int[10];
//
//        for (int i = 0; i < espisodios.length; i++) {
//            espisodios[i]= i+1;
//        }
//    }
//    espisodios = new int[10];

    public Anime(){
        System.out.println("dentro do construtor");
        for (int i = 0; i < espisodios.length; i++) {
            espisodios[i]= i+1;
            System.out.println(this.espisodios);
        }
    }
//    public Anime(String nome) {
//        this.nome = nome;
//    }
//
//
//    public Anime(){
//        for (int episodio :
//                this.espisodios) {
//            System.out.println(episodio + " ");
//        }
//        System.out.println();
//    }

//    public String getNome() {
//        return nome;
//    }
//
//    public int[] getEspisodios() {
//        return espisodios;
//    }


  

    
}
