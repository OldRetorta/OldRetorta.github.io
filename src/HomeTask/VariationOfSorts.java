package src.HomeTask;

public class VariationOfSorts {

    //Comment
    public static void bubbleSort(int[] arrey) {

        for (int i = 0; i < arrey.length; i++) {

            for (int j = i + 1; j < arrey.length; j++) {

                if (arrey[j - 1] > arrey[j]) {

                    MassMeth.swap(arrey, j - 1, j);
                }
            }
        }

    }

    public static void insertionSort(int[] arrey) {

        for (int i = 1; i < arrey.length; i++) {

            for (int j = i; j > 0; j--) {

                if (arrey[j] >= arrey[j - 1]) {

                    break;
                }

                MassMeth.swap(arrey, j, j - 1);
            }
        }
    }

    public static void selectionSort(int[] arrey) {

        int max;
        int maxIndex = 0;

        for (int i = arrey.length - 1; i >= 0; i--) {

            max = arrey[0];
            maxIndex = 0; //Облуляй, блджад, переменные, и не будешь по 2 часа тупить в код пытаясь понять что происходит!!!


            for (int j = 0; j <= i; j++) {

                if (max < arrey[j]) {

                    max = arrey[j];
                    maxIndex = j;
                }
            }

            MassMeth.swap(arrey, i, maxIndex);
        }

    }
}
