import java.util.Scanner;

public class reverseNumber {

    /*main method*/
    public static void main(String[] args) {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter whole digit number : ");
        int number = scanner.nextInt();
        int reversed = 0;

        /*for-loop to find reverse number*/
        for (;number!=0;number/=10) {
            int digit = number%10;
            reversed = reversed *10+digit;
        }
        System.out.println("Reversed number = " +reversed);
    }
}
