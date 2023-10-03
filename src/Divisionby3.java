import java.util.Scanner;

public class Divisionby3 {

    /*main method*/
    public static void main(String[] args) {

        System.out.println("Numbers between 1-100 which can be divided by 3 :");

        /*for-loop for divided by 3*/
        for (int i = 1; i <= 100 ; i++) {

            if (i%3==0){
                System.out.println(i);
            }
        }
        System.out.println("Numbers between 1-100 which can be divided by 5 :");

        /*for-loop for divided by 5*/
        for (int i = 1; i <= 100 ; i++) {

            if (i%5==0){
                System.out.println(i);
            }
        }
    }
}
