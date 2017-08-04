public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++){

                array[i][j] = (int) (Math.random() * 40 +1) - 20;
            }
        }

        double sum = TwoDimensionalArray.sumArrElem(array);

        System.out.println("Sum array elements equals: " + sum);

        TwoDimensionalArray.avarage(array);
        TwoDimensionalArray.maxValueArray(array);
        TwoDimensionalArray.minValueArray(array);
        TwoDimensionalArray.sumLineElem(array);
        TwoDimensionalArray.sumPositElem(array);
    }



    public static double sumArrElem (int[][] array){

        double result = 0;

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                result += array[i][j];
            }

        }

        return result;
    }

    public static void avarage (int[][] array){

        double result = TwoDimensionalArray.sumArrElem(array) / 100;

        System.out.println("Averege = " + result);
    }

    public static void minValueArray (int[][] array){

        int min = array[0][0];

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                if(min > array[i][j]){

                    min = array[i][j];
                }
            }

         }

           System.out.println("Minimal value of array equals: " + min);
    }

    public static void maxValueArray (int[][] array){

        int max = array[0][0];

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                if(max < array[i][j]){

                    max = array[i][j];
                }
            }

        }

        System.out.println("Maximal value of array equals: " + max);

    }

    public static void sumLineElem (int[][] array){

        int result;

        for(int i = 0; i < 10; i++){

            result = 0;

            for(int j = 0; j < 10; j++){

                result += array[i][j];
            }

            System.out.println("Sum ellements of line:" + i + " equals: " + result);

        }
    }

    public static void sumPositElem (int[][] array){

        int result = 0;

        for(int i = 0; i < 10; i++){


            for(int j = 0; j < 10; j++){

                if(array[i][j] > 0) {

                    result += array[i][j];
                }
            }


        }

        System.out.println("Sum positive elements of array equals: " + result);

    }

}
