package src.HomeTask;

import java.util.Arrays;

public class MassMeth {

    public static void swap(int[] array, int first, int second) {

        int temp;
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void fill(int[] array, int min, int max) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static void show(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public static void binarySearch(int[] array, int value) {

        int middle = array.length / 2;

        for (int i = 0; i < array.length; i++) {

            if (array[middle] > value) {

                middle = middle / 2;

            } else if (array[middle] < value) {

                middle = (array.length - middle) / 2 + 1 + middle;

            } else if (array[middle] == value) {

                System.out.println("Index of an element with a given value is: " + middle);
                break;

            } else {

                System.out.println("This array does not contain elements with a given value");
            }

        }


    }

    public static void binarySearchRecursion(int[] array, int value, int left, int right) {

        if(left > right){

            System.out.println("This array does not contain elements with a given value");
            return;
        }

        int middle = (left + right) / 2;

        if(array[middle] == value){

            System.out.println("Index of an element with a given value is: " + middle);
            return;
        }else if (array[middle] > value){

            binarySearchRecursion(array, value, left, middle - 1);
        }else {

            binarySearchRecursion(array, value, middle + 1, right);
        }


    }
}
