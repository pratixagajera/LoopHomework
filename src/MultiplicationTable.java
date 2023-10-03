import java.util.Scanner;

public class MultiplicationTable {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter number for multiplication number : ");
        int a = scanner.nextInt();

        /*for-loop for find given number of table*/
        for (int i = 1; i <=10; i++) {
            System.out.println(a +" * "+ i + " = " +(a*i));

        }
    }
}
