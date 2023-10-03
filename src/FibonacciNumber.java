import java.util.Scanner;

public class FibonacciNumber {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner= new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter the limitation number ");
        int number =scanner.nextInt();
       int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);

        /*for-loop for fibonacci number*/
        for (int i = 2; i<number ; i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
