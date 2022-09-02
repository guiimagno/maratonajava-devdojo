package academy.devdojo.maratonajava.javacore.Bmetodos.test;

import academy.devdojo.maratonajava.javacore.Bmetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome( "Guilherme Magno");
        funcionario.setIdade(31);
        funcionario.setSalarios(new double[]{1000.0, 1400.5, 1333,4});


        funcionario.imprimir();

        System.out.println(funcionario.getMedia());
    }




}
