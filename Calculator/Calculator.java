package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        // Slack comment
        Scanner scan = new Scanner (System.in);

        double first;
        double second;
        char operation;
        char check;

        do {
            System.out.println("Enter the first number");
            first = scan.nextDouble();
            System.out.println("Enter the second number");
            second = scan.nextDouble();
            System.out.println("Select the type of operation: ");
            System.out.println("*; /; +; -; or % only");
            operation = scan.next().charAt(0);
            System.out.println("To enter numbers again, enter 'n'");
            System.out.println("To continue the calculations, enter 'y'");
            check = scan.next().charAt(0);

        } while (check != 'y');

        double result = 0;

        while(operation != '=') {

            switch(operation){

                case '*':

                    result = first * second;
                    break;

                case '/':

                    if(second == 0){

                        System.out.println("An incorrect value, the divisor can not be equal to '0'. Please, enter new number");
                        second = scan.nextDouble();

                    }

                    result = first / second;
                    break;

                case '+':

                    result = first + second;
                    break;

                case '-':

                    result = first - second;
                    break;

                case '%':

                    result = first % second;
                    break;
            }

            System.out.println("Result = " + result);
            System.out.println("Select next operation or \"=\" for complete calculations");
            operation = scan.next().charAt(0);

            if(operation != '=') {

                System.out.println("Enter new number");
                second = scan.nextDouble();
                first = result;
            }

        }

        System.out.println("Total result = " + result);

    }
}
