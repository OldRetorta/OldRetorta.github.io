package HomeTask12;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number");
        String number = scan.nextLine();

        boolean check = true;

        for (int i = 0, j = number.length() - 1; i < number.length()>>1; i++, j--){

            if (number.charAt(i) != number.charAt(j)){

                System.out.println("This number is not a palindrome");
                check = false;
                break;
            }

        }

        if (check == true){

            System.out.println("This number is a palindrome");
        }


    }
}
