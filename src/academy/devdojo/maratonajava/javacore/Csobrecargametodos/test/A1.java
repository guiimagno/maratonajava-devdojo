package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import java.util.stream.IntStream;

public class A1 {
    public static void main(String[] args) {
        boolean conditionA = true;
        boolean conditionB = false;
        boolean verifyConditions = conditionA && !conditionB;
        IntStream.of(1, 2, 3, 4, 5)
                .filter(i -> verifyConditions && i > 2)
                .forEach(System.out::println);
    }
}
