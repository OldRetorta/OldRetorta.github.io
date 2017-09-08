package homeTask_19;


public class Test {

    public static void main(String[] args) {


        WrapBook first = new WrapBook();
        WrapBook second = new WrapBook();
        WrapBook thrid = new WrapBook();

        Book book1 = new Book("Sheckley Robert", "The Status Civilization / Omega", 4.98);
        Book book2 = new Book("Harrison Harry", "Bill, the Galactic Hero", 3.78);
        Book book3 = new Book("Sheckley Robert", "Bring Me the Head of Prince Charming", 4.12);
        Book book4 = new Book("Lem Stanisław", "Cyberiada", 6.98);
        Book book5 = new Book("Brown Frederic", "Martians, Go Home", 1.75);
        Book book6 = new Book("Simmons Dan", "Hyperion", 4.12);
        Book book7 = new Book("Simmons Dan", "The Fall of Hyperion", 4.12);
        Book book8 = new Book("Wodehouse Pelham Grenville", "The Inimitable Jeeves", 3.58);
        Book book9 = new Book("Carroll Lewis", "Alice's Adventures in Wonderland", 5.43);

        first.add(book1);
        first.add(book2);
        first.add(book3);
        first.add(book4);
        first.add(book5);
        second.add(book6);
        second.add(book7);
        second.add(book8);
        second.add(book9);

        first.show();
        System.out.println("____________________________");
        second.show();

        System.out.println("____________________________");
        first.addAll(second);
        first.show();
        System.out.println("____________________________");

        thrid.copy(second);
        thrid.show();
        System.out.println("____________________________");

        System.out.println(first.equals(second));
        System.out.println(second.equals(thrid));
        System.out.println("____________________________");

        System.out.println("The book is on the index: " + first.find(book2));
        System.out.println(first.getBook(3).toString());
        System.out.println("____________________________");

        thrid.clear();

        System.out.println("Arrays first have " + first.getSize() + " elements");
        System.out.println("____________________________");

        first.sort();
        first.show();




    }
}
