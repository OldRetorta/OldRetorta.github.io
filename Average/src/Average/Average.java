package Average;

import java.util.Scanner;

public class Average {

    public static void main (String[] args) {

        // Slack comment
        Scanner scan = new Scanner(System.in);
        String finish;
        double number = 0;
        int count = 0;
        double temp = 0;

        do {

            System.out.println("Enter number or 'end'  to complete");
            finish = scan.nextLine();

            if(finish.equals("end")){

                double result = temp / count;

                System.out.println("Averege = " + result);

            } else {

                number = Double.parseDouble(finish);
                temp = temp + number;

                count++;

            }


        } while (!finish.equals("end"));
    }
}
