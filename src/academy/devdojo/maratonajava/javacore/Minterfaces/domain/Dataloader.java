package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface Dataloader {

    int MAX_DATA_SIZE=10;
    void load();
    default void checkPemission(){
        System.out.println("fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }

}
