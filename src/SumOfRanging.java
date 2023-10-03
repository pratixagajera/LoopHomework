import java.util.Scanner;

public class SumOfRanging {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter a whole digit number 1-20 :");
        int a = scanner.nextInt();
        System.out.println("Please enter a whole digit number 1-20 :");
        int b = scanner.nextInt();
        int sum = 0;

       /*for-loop to find sum of given range*/
        for (int i = a; i <=b ; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum of given range is " + sum);
    }
}
