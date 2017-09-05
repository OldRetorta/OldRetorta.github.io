package HomeTask_19;


public class Test {

    public static void main(String[] args) {

        WrapInt first = new WrapInt();
        WrapInt second = new WrapInt();


        final int max = 10;
        final int min = 0;
        final int index = 0;
        final int value = 4;

        for (int i = 0; i < first.getSize() + 1; i++) {

            first.add((int) (Math.random() * (max - min + 1) + min));
            second.add((int) (Math.random() * (max - min + 1) + min));
        }
        WrapInt third = new WrapInt(first.getSize());
        third.copy(first);

        first.show();
        second.show();
        third.show();
        System.out.println("Element by index " + index + " equals: " + first.getValue(index));
        System.out.println("Value found: " + first.contains(value));
        System.out.println(first.equals(second));;
        System.out.println(first.equals(third));;
        first.addAll(second);
        first.show();
        third.clear();
        third.show();
        System.out.println(first.getLastElement());


    }
}
