package SimpleNumbers;

import java.util.Scanner;

public class SimpleNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();

        int lim = (int) Math.sqrt(number);
        boolean check = true;

        if (number % 2 == 1) {

            for(int i = 3; i <= lim; ) {

                if(number % i == 0) {

                   System.out.println("Number: " + number + " - is not simple");
                   check = false;
                   break;
                }

                i = i + 2;

            }

        }else if (number == 2) {

            System.out.println("Number: " + number + " - is simple");
            check = false;

        }else {

            System.out.println("Number: " + number + " - is not simple");
            check = false;
        }

        if (check == true) {

            System.out.println("Number: " + number + " - is simple");
        }

    }
}
