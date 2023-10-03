import java.util.Scanner;

public class Divisiblenumber {

    /*main method*/
    public static void main(String[] args) {

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter number which is starting point of a range : ");
        int a = scanner.nextInt();
        System.out.println("Please enter number which is ending point of a range : ");
        int b = scanner.nextInt();
        int sum = 0;

        /*for loop for sum*/
        for (int i = a; i <=b ; i++) {
            sum = sum + i;
        }

        /*if -else conditional statement*/
        if (sum%9==0){
                System.out.println("The sum of given number of range " +a+ " & " +b +" is divisible by 9");
            }else {
                System.out.println("The sum of given number of range " +a+ " & " +b +" is not divisible by 9");
            }


    }
}
