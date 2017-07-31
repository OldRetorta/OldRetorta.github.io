package HomTasks;

import java.util.Scanner;

public class Multiplicity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String number;  // Если не использовать String, не получится проверико корректность введенных пользователем данных.
        boolean check;

        do {
            System.out.println("Enter number");
            number = scan.nextLine();
            int i = 0;
            check = true;

            if(number.charAt(0) == '-' || number.charAt(0) == '+'){

                i = 1;
            }

            for (; i < number.length(); i++){

                if (!Character.isDigit(number.charAt(i))){

                    System.out.println("Incorrect value, please try again");
                    check = false;
                    break;
                }
            }

        }while(check != true);

        int value = Integer.parseInt(number);
        value = Math.abs(value);
        System.out.print("The number - '" + number + "'  is a multiple of the following numbers: ");

        for(int i = 1; i <= value; i++) {

            if(value % i == 0){

                System.out.print(i + "; ");

            }

        }
    }
}
