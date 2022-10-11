package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 1D;
        char charP = 'm';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 1D;
        Character charW = 'm';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);

        System.out.println(Character.isLetterOrDigit('r'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isUpperCase('w'));
        System.out.println(Character.isAlphabetic('1'));
    }

}
