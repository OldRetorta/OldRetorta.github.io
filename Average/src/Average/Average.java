package Average;

import java.util.Scanner;

public class Average {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        String finish;
        int number = 0;
        int count = 0;
        int temp = 0;

        do {

            System.out.println("Enter number or 'end'  to complete");
            finish = scan.nextLine();

            if(finish.equals("end")){

                int result = temp / count;

                System.out.println("Averege = " + result);

            } else {

                number = Integer.parseInt(finish);
                temp = temp + number;

                count++;

            }


        } while (!finish.equals("end"));
    }
}
