package home.task22;

public class Parsing {

    public static void main(String[] args) {


        String mathExpression = "25 * 17 + (14 - 3) + ((17 - 1) * 36)";

        char[] array = mathExpression.toCharArray();

        Stak stak = new Stak(array.length);

        for (int i = 0; i < array.length; i++) {

            if (array[i] == ')' && stak.isEmpty()) {

                System.out.println("The mathematical expression is incorrect");
                System.exit(0);
            }
            if (array[i] == '(') {

                stak.push(array[i]);
            }

            if (array[i] == ')') {

                stak.pop();
            }

        }

        if (stak.isEmpty()) {

            System.out.println("The mathematical expression is correct");
        } else {
            System.out.println("The mathematical expression is incorrect");
        }


    }
}
