package br.com.venturus.operators;

public class OperatorChallenge {
    public static void main(String[] args) {
        int x = 100;
        int a  = x++;
        int b = ++x;
        int c = x++;
//        int d = (a > b) ? (a < c) ? a: (b < c)? b: c: x;
//        System.out.println(d);

        //Alternatives:
        //A. 100
        //B. 101
        //C. 102
        //D. 103
        //E. Compilation fails
    }
}
