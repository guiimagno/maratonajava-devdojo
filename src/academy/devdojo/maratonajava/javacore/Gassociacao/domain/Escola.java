package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println("Colégio="+this.nome);
        if (professores == null){
            return;
        }
        for (Professor professor : professores) {
            System.out.println("professor="+professor.getNome());
        }

    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professores;
    }

    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }
}
