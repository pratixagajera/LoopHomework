import java.util.Scanner;

public class NaturalNumberSum {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter a whole digit number : ");
        int a = scanner.nextInt();
        int sum = 0;

        /*for-loop to find sum of natural number*/
        for (int i =0 ; i <=a; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
