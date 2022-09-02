package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização ESTÁTICO de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionario2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do CONSTRUTOR de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome +"Recebi o salario de "+ this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
