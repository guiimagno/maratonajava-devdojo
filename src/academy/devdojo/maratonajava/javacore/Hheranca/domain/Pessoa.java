package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização ESTÁTICO de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do CONSTRUTOR de Pessoa");
        this.nome = nome;
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " " + "CEP: " + this.endereco.getCep());
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
