import java.util.Scanner;

public class InputRange {

    /*main method*/
    public static void main(String[] args)
    {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter number from you want to start print :");
        int a = scanner.nextInt();
        System.out.println("Please enter number from you want to end print :");
        int b = scanner.nextInt();


        /*for-loop for find range for*/
        for (int i = a; i<= b; i++)
        {
            System.out.println(i);
        }
    }
}
