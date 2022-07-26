package br.com.venturus.controlflow;

public class ControlFlowExample {
    public static void main(String[] args) {
        ifExamples();

        //other example:
//        System.out.println("other example:");
//        boolean isAdmin = false;
//        boolean isGuest = false;
//        if(args.length > 0){
//            System.out.println(args.length);
//            for(String arg : args){
//                System.out.println(arg);
//                if(arg.equals("--admin")) {
//                    isAdmin = true;
//                } else if(arg.equals("--guest")) {
//                    isGuest = true;
//                }
//            }
//        }
//        if(isAdmin && !isGuest){
//            System.out.println("Hello, Admin!");
//        }
//        else if(!isAdmin && isGuest){
//            System.out.println("Hello, Guest!");
//        }
//        else{
//            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
//        }

//        traditionalSwitch();
//        switchExpression();
//        loopExamples();
    }

    public static void ifExamples() {
        System.out.println("ifExamples");

        int amountOfMoneyOnAccount = 100;
        int itemPrice = 200;

        if (amountOfMoneyOnAccount < itemPrice) {
            System.out.println("You don't have enough money on your account to purchase "
                    + "this item.");
        } else {
            // purchase logic implementation here
            System.out.println("Item is purchased");
        }

        // No braces demo

        amountOfMoneyOnAccount += 200;
        if (amountOfMoneyOnAccount < itemPrice)
            System.out.println("You don't have enough money on your account to purchase " + "this item.");
        else
            // purchase logic implementation here
            System.out.println("Item is purchased");
        System.out.println("I'm not in else block here");

        // Nested if statement

        int i1 = 3;
        int i2 = 2;
        int i3 = 10;
        if (i1 > i2) {
            if (i1 > i3)
                System.out.println("i1 is more than i2 and i3");
            else
                System.out.println("i1 is more than i2 but less than i3");
        }

        // if - else - if

        int orderPrice = 1000;

        if (orderPrice > 0 && orderPrice < 100) {
            System.out.println("You have 5% discount for this order");
        } else if (orderPrice >= 100 && orderPrice < 500) {
            System.out.println("You have 10% discount for this order");
        } else if (orderPrice >= 500 && orderPrice < 5000) {
            System.out.println("You have 15% discount for this order");
        }
    }

    public static void traditionalSwitch(){
        System.out.println("traditionalSwitch - part1");
        String result;
        String animal = "CAT";

        //if else if example:
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        System.out.println(result);

        //switch example:
        System.out.println("traditionalSwitch - part2");
//        String cat="CAT";
        switch (animal) {
            case "DOG":
                result = "domestic animal";
                break;
            case "CAT":
                result = "domestic animal";
                break;
//            case cat: //does not compile
//                result = "feline"
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        System.out.println(result);
    }

    public static void switchExpression(){
        System.out.println("switchExpression");
        String month = "SEPTEMBER";
        var result = switch(month) {
            case "JANUARY", "JUNE", "JULY" -> 3;
            case "FEBRUARY", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> 1;
            case "MARCH", "MAY", "APRIL", "AUGUST" -> 2;
            default -> 0;
        };
        System.out.println(result);
    }

    public static void loopExamples(){
        System.out.println("loopExamples");

        // while loop
        int x = 0;
        while (x < 5) { // control expression
            System.out.println("While loop: x = " + x++);
        }

//        while(true)
//            System.out.println("infinite loop");

        // do while loop
        int y = 0;
        do {
            System.out.println("Do-While loop: y = " + y++);
        } while (y < 5);

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Simple for loop: i = " + i);
        }

        // Infinite for loop
//        for ( ; ; ) {
//            System.out.println("infinite loop");
//        }

        // Enhanced for loop
        int[] intArr = { 0,1,2,3,4 };
        for (int num : intArr) {
            System.out.println("Enhanced for-each loop: i = " + num);
        }

        // labeled loop
        System.out.println("Labeled loop:");
        aa: for (int i = 1; i <= 3; i++) {
            if (i == 1)
                continue;
        bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
            System.out.println("finished bb");
        }
        System.out.println("finished aa");

    }
}
