import java.util.Scanner;

public class MarksDemo {
    public static void main(String[] args) {

        char input;
        System.out.println("******* IVR *******");
        System.out.println("1. Press 1 for English");
        System.out.println("2. Press 2 for Spanish");
        System.out.println("3. Press 3 for French");
        System.out.println("4. Press 4 for Russian");
        System.out.println("5. Press 5 for Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the user input");
        input = scanner.next().charAt(0);

        // type casting

        // Char  -- data type ---> 'A', 'B'
        // String - " Hello world "
        switch (input){


            case 'A':
                System.out.println("English");
                break;

            case 'B':
                System.out.println("Spanish");
                break;

            case 'C':
                System.out.println("French");
                break;
            case 'D':
                System.out.println("Russian");
                break;

            case 'E':
                System.out.println("Exit of out the code");
                break;
            default:
                System.out.println("Invalid input, please try again.. ");
        }



        /*

        switch(input){


        case 1:

        break;


        case 2:

        break;


        case 3:

        break;


        default:
        // print

        }


         */


    }
}

/*
&&
     1.  true - true ====> true
     2. true - false ----> false
     3. false - false --- > false


     ||

      true -- falase ---> true
      false - false ---> false
      true -- true --> true





 */
