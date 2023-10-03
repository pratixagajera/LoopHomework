import java.util.Scanner;

public class PrimeNumber {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any whole digit : ");
        int a = scanner.nextInt();
        boolean result = false;

        /*for-loop to find prime number*/
        for (int i = 2; i <=a/2 ; i++) {
            if (a%i==0){
                result= true;
                break;
            }
        }

        /*if-else conditional statement for answer*/
        if (!result){
            System.out.println(a + " is prime number");
        }else {
            System.out.println(a + " is not prime number");
        }
    }
}
