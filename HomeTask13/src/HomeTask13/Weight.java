package HomeTask13;

import java.util.Scanner;

public class Weight {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String units;
        boolean check = true;
        do {
            System.out.println("Enter the units 'ton, kg, or gr");
            units = scan.nextLine();
            check = true;
            if (!units.equalsIgnoreCase("ton") && !units.equalsIgnoreCase("kg") && !units.equalsIgnoreCase("gr")) {

                System.out.println("Incorrect value, please try again");
                check = false;
            }

        } while (check != true);

        String number;
        do {
            System.out.println("Enter the number");
            number = scan.nextLine();
            check = true;
            for (int i = 0; i < number.length(); i++) {

                if (number.charAt(i) != '.' && !Character.isDigit(number.charAt(i))) {

                    System.out.println("Incorrect value, please try again");
                    check = false;
                    break;
                }
            }

        } while (check != true);



        switch (units) {

            case "gr":

                int gram = (int) Double.parseDouble(number);
                Weight.parse(gram);
                break;

            case "kg":

                int kg = (int) (Double.parseDouble(number) * 1000);
                Weight.parse(kg);
                break;

            case "ton":

                int ton = (int) (Double.parseDouble(number) * 1000000);
                Weight.parse(ton);
                break;

        }

    }

    public static void parse (int number){

        StringBuilder result = new StringBuilder();


        if (number / 1000000 != 0){

            result.append(number / 1000000).append(" tons ");
        }

        number %= 1000000;

        if(number / 1000 != 0) {

            result.append(number / 1000).append(" kilogrammes ");

        }

        number %= 1000;

        if(number != 0){

            result.append(number).append(" grams");
        }

        System.out.println(result.toString());

    }

}
