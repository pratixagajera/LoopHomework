import java.util.Scanner;

public class AverageAndSumNumbers {

    /*main method*/
    public static void main(String[] args) {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter whole digit number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter whole digit number : ");
        int b = scanner.nextInt();
        int sum = 0;

        /*for loop for sum*/
        for (int i =0 ; i <=a; i++) {
            sum = sum+i;
        }
        System.out.println("The sum of given range = " +sum);
        System.out.println("The average of given number = " +((a+b)/2));
    }
}
