import java.util.Scanner;

public class CalculationNumber {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter a whole digit number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter a whole digit number : ");
        int b = scanner.nextInt();
        System.out.println("Please enter any one operator : +, -, *, / ");
        char operator = scanner.next().charAt(0);


        /*switch operator*/
        switch (operator){
            case '+' :
                System.out.println(a +" + " +b + " = " +(a+b));
                break;

            case '-' :
                System.out.println(a +" - " +b +" = " +(a-b));
                break;

            case '*' :
                System.out.println(a +" * " +b +" = " +(a*b));
                break;

            case '/' :
                System.out.println(a +" / " +b +" = " +(a/b));
                break;

            default:
                System.out.println("Invalid Operator");

        }


    }
}
