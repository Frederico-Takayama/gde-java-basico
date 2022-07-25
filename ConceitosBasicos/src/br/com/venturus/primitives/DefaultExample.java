package br.com.venturus.primitives;

public class DefaultExample {
    boolean tipoBooleano;
    byte tipoByte;
    short tipoShort;
    char tipoChar;
    int tipoInt;
    long tipoLong;
    float tipoFloat;
    double tipoDouble;

    @Override
    public String toString(){
        System.out.println("Default examples");
        return String.format("Default do tipo Boolean: %b\n", tipoBooleano) +
                String.format("Default do tipo byte: %d\n", tipoByte) +
                String.format("Default do tipo short: %d\n", tipoShort) +
                String.format("Default do tipo char: %c\n", tipoChar) +
                String.format("Default do tipo int: %d\n", tipoInt) +
                String.format("Default do tipo long: %d\n", tipoLong) +
                String.format("Default do tipo float: %f\n", tipoFloat) +
                String.format("Default do tipo double: %f\n", tipoDouble);
    }
}
