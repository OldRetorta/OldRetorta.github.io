package Calculator;

import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the first number");
        double first = scan.nextDouble();
        System.out.println("Enter the second number");
        double second = scan.nextDouble();
        System.out.println("Select the type of operation: ");
        System.out.println("*; /; +; -; or % only");
        char operation = scan.next().charAt(0);
        System.out.println("To complete calculations, enter \"=\"");

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
