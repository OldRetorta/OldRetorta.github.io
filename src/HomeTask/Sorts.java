package src.HomeTask;

import java.util.Scanner;

public class Sorts {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of search");
        int value = scan.nextInt();

        int[] randomArrey = new int[20];

        final int min = 0;
        final int max = 20;

        MassMeth.fill(randomArrey, min, max);

        MassMeth.show(randomArrey);

        VariationOfSorts.selectionSort(randomArrey);

        MassMeth.show(randomArrey);

        MassMeth.binarySearch(randomArrey, value);

        MassMeth.binarySearchRecursion(randomArrey, value, 0, randomArrey.length - 1);



    }
}
