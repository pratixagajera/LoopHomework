import java.util.Scanner;

public class MinimumMaximumNumber {

    /*main method*/
    public static void main(String[] args) {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter whole digit number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter whole digit number : ");
        int b = scanner.nextInt();
        System.out.println("Please enter whole digit number : ");
        int c = scanner.nextInt();


        /*if-else conditional statement to find smallest number*/
        if (a<=b && a<=c){
            System.out.println(a + " is the smallest number");
        }else if (b<=c && b<=a){
            System.out.println(b + " is the smallest number");
        }else {
            System.out.println(c + "is the smallest number");
        }


        /*if-else conditional statement to find largest number*/
        if (a>=b && a>=c){
            System.out.println(a + " is largest number");
        }else if (b>=a && b>=c){
            System.out.println(b + " is largest number");
        }else {
            System.out.println(c + " is largest number");
        }
    }
}
