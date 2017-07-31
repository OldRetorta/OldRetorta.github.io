package homeTask.Stars;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int lines = scan.nextInt();
        System.out.println("Enter number of rows");
        int rows = scan.nextInt();

        System.out.println("Select the pattern:");
        System.out.println("1 - Rectangle");
        System.out.println("2 - Envelope");
        System.out.println("3 - Chess");
        int choice = scan.nextInt();

        switch (choice) {

            case 1:


                for(int x = 0; x < rows; x++){

                    for(int y = 0; y < lines; y++){

                        if((x == 0 || x == rows - 1) || (y == 0 || y == lines -1)) {

                            System.out.print("*");
                        }else {

                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }

                break;

            case 2:

                lines = rows;

                for(int x = 0; x < rows; x++){

                    for(int y = 0; y < lines; y++){

                        if((x == 0 || x == rows - 1) || (y == 0 || y == lines -1) || ((x == (rows - 1 - y)) && (y == (lines - 1 - x))) || (x == y)) {

                            System.out.print("*");
                        }else {

                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }

                break;

            case 3:

                for(int x = 0; x < rows; x++){

                    for(int y = 0; y < lines; y++){

                        if((x % 2 == 0 && y % 2 != 0) || (x % 2 != 0 && y % 2 == 0)) {

                            System.out.print("*");

                        }else {

                            System.out.print(" ");
                        }

                    }

                    System.out.println();
                }

                break;
        }

    }
}
