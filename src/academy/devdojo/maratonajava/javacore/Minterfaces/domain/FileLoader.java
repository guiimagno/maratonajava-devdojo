package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements Dataloader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados de um arquivo");
    }

    @Override
    public void checkPemission() {
        System.out.println("checando permissão dentro do FileLoader");
    }
}
