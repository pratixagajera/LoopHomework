import java.util.Scanner;

public class Triangularpattern {

    /*main method*/
    public static void main(String[] args) {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter a number : ");
        int number = scanner.nextInt();

        /*for-loop to get output*/
        for (int i = 0; i <number; i++) {

            for (int j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();/*for next line*/
        }
    }
}
