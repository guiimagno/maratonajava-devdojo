package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBD;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio= new RepositorioBD();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("goku");
        list.add("vegeta");
        list.add("guirra");

        System.out.println(list);
    }
}
