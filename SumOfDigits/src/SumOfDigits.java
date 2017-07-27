
import java.util.Scanner;
public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        int result = 0;
        int temp;

        while (number > 1){

            temp = number % 10;
            result = result + temp;
            number = number / 10;
        }

        System.out.println("Som of digits of number: " + number + "is - " + result);
    }
}
