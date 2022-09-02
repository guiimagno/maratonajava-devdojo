package academy.devdojo.maratonajava.javacore.Bmetodos.dominio;

public class ImpressaoEstudante {
    public void imprime(Estudante estudante){

        System.out.println("-------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "gui";
        System.out.println(estudante.nome);
    }

}
