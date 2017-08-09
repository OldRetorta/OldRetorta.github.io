package HomeTaskMatrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int columns = scan.nextInt();
        int firstColumn;
        int secondColimn;

        do {
            System.out.println("Enter the first column number for the exchange");
            firstColumn = scan.nextInt();

            if (firstColumn > columns || firstColumn <= 0) {

                System.out.println("Incorrect value, please try again");

            }
        } while (firstColumn > columns || firstColumn <= 0);

        do {
            System.out.println("Enter the second column number for the exchange");
            secondColimn = scan.nextInt();

            if (secondColimn > columns || secondColimn <= 0) {

                System.out.println("Incorrect value, please try again");

            }
        } while (secondColimn > columns || secondColimn <= 0);

        int[][] randomArrey = new int[rows][columns];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                randomArrey[i][j] = (int) (Math.random() * 100 + 1);

            }
        }

        Matrix.show(randomArrey);
        Matrix.show(Matrix.swap(randomArrey, firstColumn, secondColimn));

        int max = 0;
        int indexOfMax = -1;

        for (int i = 0; i < randomArrey.length; i++){

            if (max < Matrix.sumColumnElem(randomArrey[i])) {

                indexOfMax = i;
                max = Matrix.sumColumnElem(randomArrey[i]);
            }

        }

        System.out.println("The index of the column with the maximum sum of elements is " + indexOfMax + "; sum of elements is " + max);


    }

    public static int[][] swap(int[][] arrey, int first, int second) {

        int temp;

        for (int i = 0; i < arrey.length; i++) {

            temp = arrey[i][first];
            arrey[i][first] = arrey[i][second];
            arrey[i][second] = temp;

        }

        return arrey;
    }

    public static void show(int[][] arrey) {

        for (int i = 0; i < arrey.length; i++) {

            for (int j = 0; j < arrey[0].length; j++) {

                System.out.print(arrey[i][j] + " ;");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static int sumColumnElem (int[] arrey){

        int sum = 0;
        for (int i = 0; i < arrey.length; i++){

            sum += arrey[i];

        }

        return sum;
    }
}
