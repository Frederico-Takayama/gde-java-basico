package br.com.venturus.primitives;

public class Primitives {
    public static void main(String[] args) {
        primitiveExamples();

        limitsInfo();

        System.out.println(new DefaultExample().toString());

//      boolean tipoBooleano;
        // line below doesn't work because was not initialized
//      System.out.println(tipoBooleano);

        casting();
    }

    /**
     * a method to show how to declare and initialize a value;
     */
    private static void primitiveExamples() {
        boolean tipoBooleano = true;

        boolean tipoBooleano2;
        tipoBooleano2 = false;

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807l;
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;

        System.out.println("Valor do tipoBooleano = " + tipoBooleano);
        System.out.println("Valor do tipoBooleano2 = " + tipoBooleano2);
        System.out.println("Valor do tipoByte = " + tipoByte);
        System.out.println("Valor do tipoShort = " + tipoShort);
        System.out.println("Valor do tipoChar = " + tipoChar);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("Valor do tipoFloat = " + tipoFloat);
        System.out.println("Valor do tipoDouble = " + tipoDouble);
        System.out.println("Valor do tipoLong = " + tipoLong);
        System.out.println();
    }

    /**
     * a method to show min an max values for some types
     */
    private static void limitsInfo() {
        System.out.println("Tipos de dados em Java:" +
                "\nMenor Byte: " + Byte.MIN_VALUE +
                "\nMaior Byte: " + Byte.MAX_VALUE +
                "\nMenor Short Int: " + Short.MIN_VALUE +
                "\nMaior Short Int: " + Short.MAX_VALUE +
//                "\nMenor Character: " + Character.MIN_VALUE +
//                "\nMaior Character: " + Character.MAX_VALUE +
                "\nMenor Int: " + Integer.MIN_VALUE +
                "\nMaior Int: " + Integer.MAX_VALUE +
                "\nMenor Long: " + Long.MIN_VALUE +
                "\nMaior Long:" + Long.MAX_VALUE +
                "\nMenor Float: " + Float.MIN_VALUE +
                "\nMaior Float: " + Float.MAX_VALUE +
                "\nMenor Double: " + Double.MIN_VALUE +
                "\nMaior Double: " + Double.MAX_VALUE);
        System.out.println();
    }

    /**
     * a method jsut to see other ways to write a variable;
     */
    public void otherExamples(){
        long bytes = 0b11010010_01101001_10010100_10010010;
        float pi =  3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexadecimal = 0x7fff_ffff_ffff_ffffL;
        long octal = 077_777L;
    }

    public static void casting(){
        int x = 10;
        double y = x;
        System.out.println("Casting examples");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        double population = 4_561_000_000D;
        int people = (int) population;

        System.out.println(String.format("population: %e" , population));
        System.out.println(String.format("people:     %e" , (double) people));
        System.out.println();
    }
}
