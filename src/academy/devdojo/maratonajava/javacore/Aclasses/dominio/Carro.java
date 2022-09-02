package academy.devdojo.maratonajava.javacore.Aclasses.dominio;

public class Carro {
    private String nome;
    private String modelo;
    private String ano;

    public Carro(){

    }
    public Carro(String nome, String modelo, String ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
