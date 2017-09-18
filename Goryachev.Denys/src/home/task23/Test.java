package home.task23;

public class Test {

    public static void main(String[] args) {

        String str1 = "Just string";
        String str2 = "Another string";
        String str3 = "One more string";
        String str4 = "and more";
        String str5 = "... more";
        String str6 = "... more and more";
        String str7 = "Kill Bill";
        String str8 = "Lolipop";
        String str9 = "Doomed string";
        String str10 = "Tenth string";

        SingleLinkedList list = new SingleLinkedList();

        list.addHead(str1);
        list.addTail(str2);
        list.addTail(str3);
        list.addTail(str4);
        list.addTail(str5);
        list.addHead(str6);
        list.addHead(str7);
        list.addHead(str8);
        list.addHead(str9);
        list.addHead(str10);

        System.out.println(list.getCount());
        System.out.println(list.getIndexOf(1));
        System.out.println("___________________________");

        list.show();
        System.out.println("___________________________");

        list.delOfIndex(9);
        System.out.println(list.getCount());
        list.show();
        System.out.println("___________________________");

        list.insertElement(5, "Inserted string");
        list.show();
        System.out.println(list.getCount());

    }
}
