package homeTask_19;

public class Book implements Comparable {

    private String autor;
    private String name;
    private double cost;

    public Book() {

    }

    public Book(String autor, String name, double cost) {
        this.autor = autor;
        this.name = name;
        this.cost = cost;
    }

/*    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
 */


    @Override
    public int compareTo(Object prime) {

        if (!(prime instanceof Book)) {

            System.exit(-10);
        }

        Book book = (Book) prime;

        return autor.compareToIgnoreCase(book.autor);
    }

    public static Book copyBook(Book book) {

        Book newBook = new Book();

        newBook.name = book.name;
        newBook.autor = book.autor;
        newBook.cost = book.cost;

        return newBook;

    }

    @Override
    public String toString() {

        return "Autor: " + autor + " - " + name + " " + cost + "$";
    }

    public boolean equals(Book book) {

        if (!name.equalsIgnoreCase(book.name) || !autor.equalsIgnoreCase(book.autor) || cost != book.cost) {

            return false;
        }

        return true;
    }
}
