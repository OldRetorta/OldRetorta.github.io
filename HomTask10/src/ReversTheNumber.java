
import java.util.Scanner;

public class ReversTheNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean check = true;
        String number;
        do {

            System.out.println("Enter the number");
            number = scan.nextLine();

            for(int i = 0; i < number.length(); i++){

                 check = true;

                if (!Character.isDigit(number.charAt(i))){

                    System.out.println("Incorrect value, please try again");
                    check = false;
                    break;
                }
            }

        }while(check == false);

        ReversTheNumber.revers(number);


    }

    public static void revers (String number){

        char[] mirror = new char[number.length()];

        int j = 0;
        for(int i = number.length() - 1; i >= 0; i--, j++){

            mirror[j] = number.charAt(i);

        }

        int result = Integer.parseInt(String.valueOf(mirror));

        System.out.println(result);

    }
}


