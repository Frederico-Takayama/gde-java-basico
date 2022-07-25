package br.com.venturus.specialkey;

public class SpecialKey {
    /**
     * some var inferences example.
     * Don't get worried about content on System.out.println,
     * just understand the idea about compiler guessing about
     * which value are related to which type.
     */
    public static void main(String[] args) {
        var x = false;
        var y = 1;
        var w = 1L;
        var z = 1f;
        var c = 'c';

        System.out.println(((Object) x).getClass().getName());
        System.out.println(((Object) y).getClass().getName());
        System.out.println(((Object) w).getClass().getName());
        System.out.println(((Object) z).getClass().getName());
        System.out.println(((Object) c).getClass().getName());
    }
}
