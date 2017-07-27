
import java.util.Scanner;

public class Dot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sepInd;

        String[] coordinate = new String[3];
        String[] message = new String[6];
        message[0] = "Enter the coordinates of the top-left corner of the rectangle in the format: (x;y)";
        message[1] = "Enter the coordinates of the bottom-right corner of the rectangle in the format: (x;y)";
        message[2] = "Enter the coordinates of dot in the format: (x;y)";
        message[3] = "This point belong to the area of the rectangle";
        message[4] = "This point does not belong to the area of the rectangle";
        message[5] = "Incorrect value, enter again";
        int [][] dotCoord = new int [3][2];


        for (int i = 0; i<3; i++) {

            do {
                System.out.println(message[i]);
                coordinate[i] = scan.nextLine();

                if (!coordinate[i].matches("(-|\\+)?\\d+\\;(-|\\+)?\\d+")) {

                    System.out.println(message[5]);

                }

            } while (!coordinate[i].matches("(-|\\+)?\\d+\\;(-|\\+)?\\d+"));

            sepInd = coordinate[i].indexOf(';');

            dotCoord[i][0] = Integer.parseInt(coordinate[i].substring(0,sepInd));
            dotCoord[i][1] = Integer.parseInt(coordinate[i].substring(sepInd + 1, coordinate[i].length()));

            if (i == 1 && (dotCoord[0][0] >= dotCoord[1][0] || dotCoord[0][1] <= dotCoord[1][1])) {

                System.out.println(message[5]);

                i = -1;
            }

        }

        if(dotCoord[0][0] < dotCoord[2][0] && dotCoord[1][0] > dotCoord[2][0] && dotCoord[0][1] > dotCoord[2][1] && dotCoord[1][1] < dotCoord[2][1]) {

            System.out.println(message[3]);

        }else {

            System.out.println(message[4]);

        }



    }
}
