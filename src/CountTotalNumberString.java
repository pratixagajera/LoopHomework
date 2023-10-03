import java.util.Scanner;

public class CountTotalNumberString {

    /*main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any sentence : ");
        String a = scanner.nextLine();
        int count = 0;

        /*for loop for count total number of string*/
        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i)=='a')
                count++;
        }

        System.out.println("The total number of ' a ' in this string = " +count);
    }
}
