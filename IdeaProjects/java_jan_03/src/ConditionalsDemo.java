import java.util.Scanner;

public class ConditionalsDemo {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the number");
        number = scanner.nextInt();

        // Arithmetic opeators
        // Binary ---    Unary
        // increment and decrement operator
        // ++ --
        //  + - * / %
        // 5 % 2 == 1   == gives remainder
        // 5 / 2 == 2.5 == quotient

        // ! -- not operator

        if(number % 2 == 0 ){

            System.out.println("number is even");
        }
        else{
            System.out.println("Number is odd");
        }











    }
}

/*



   // if else

        /*
        if(condition){


        //statement
        }

        else{

        // statement

        }
 */
