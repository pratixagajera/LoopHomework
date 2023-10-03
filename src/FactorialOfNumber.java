import java.util.Scanner;

public class FactorialOfNumber {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter a whole digit number : ");
        int a = scanner.nextInt();
        int result = a;

        /*for-loop for factorial number*/
        for (int i = (a-1); i > 1; i--) {
            result = result*i;

        }
        System.out.println("factorial number of " + a +" = " +result);
        }



    }

