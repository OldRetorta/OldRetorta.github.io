package home.task24;

public class Test {

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.add("String number 1");
        list.add("String number 2");
        list.add("String number 3");
        list.add("String number 4");
        list.add("String number 5");

        System.out.println(list.peek());
        System.out.println("________________________");
        list.queueProcessing();


    }
}
