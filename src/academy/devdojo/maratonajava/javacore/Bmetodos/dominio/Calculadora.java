package academy.devdojo.maratonajava.javacore.Bmetodos.dominio;

public class Calculadora {

    // VOID - NÃO TEM RETORNO, MAS TEM SAÍDA
    public void somarDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(10 - 1);
    }

    // PASSANDO PARAMETROS
    public void multiplicaDoisNumeros(int x, int y){
        System.out.println(x * y);;
    }

    // TEM QUE RETORNAR - STATEMNENT RETURN
    public double divideDoisNumeros(double x, double y){
        if (y == 0){
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return x/y;
    }
    public double divideDoisNumeros02(double x, double y){
        if (y != 0){
            return x/y;
        }
        System.out.println("Não existe divisão por zero");
        return 0;
    }

    public void imprimeDivideDoisNumeros03(double x, double y){
        if (y == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(x/y);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera");
        System.out.println("numero1->" +numero1);
        System.out.println("numero2->" +numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int temp : numeros){
            soma = soma + temp;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(double valor, int... numeros){
        int soma = 0;
        for(int temp : numeros){
            soma = soma + temp;
        }
        System.out.println(soma);
    }
}
