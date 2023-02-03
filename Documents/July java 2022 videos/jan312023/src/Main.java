import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arithmetic operators
        //+ - * / %
        // = - assignment operator
        // Logical operator
        // <, >, ==, !=

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter value for a");
//        int a = sc.nextInt();
//        System.out.println("Please enter value for b");
//        int b = sc.nextInt();

        // ==
        // in if say "a and b are same"
        // in else say "a and b are not same"

        /*
        * AND -> &&
        * OR -> ||
        *
        * AND
        * true true = true
        * true false = false
        * false true = false
        * false false = false
        *
        * OR
        * * true true = true
         * true false = true
         * false true = true
         * false false = false
        *
        *
        * */

//        if(a >= 50){
//            System.out.println();
//        } else if((a >= 40) && (a <=49) ){
//            System.out.println();
//        } else if( (a >= 30) || (a <= 39)){
//            System.out.println();
//        } else if (){
//            System.out.println();
//        } else {
//
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a for English");
        System.out.println("Please enter b for French");
        System.out.println("Please enter c for Spanish");
//        int input = sc.nextInt();
        String strInput = sc.next();

        switch (strInput){
            case "a":
                System.out.println("English is selected");
                break;
            case "b":
                System.out.println("French is selected");
                break;
            case "c":
                System.out.println("Spanish is selected");
                break;
            default:
                System.out.println("Wrong input: Please try again!");
        }


















    }
}