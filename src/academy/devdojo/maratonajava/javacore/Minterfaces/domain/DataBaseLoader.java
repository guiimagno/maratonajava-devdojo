package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements Dataloader, DataRemover{

    @Override
    public void load() {
        System.out.println("carregando dados do bando de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo bando de dados");
    }

    @Override
    public void checkPemission() {
        System.out.println("checando permissão dentro do DataBaseLoader");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("dentro do retrieveMaxDataSize na interface");
    }
}
