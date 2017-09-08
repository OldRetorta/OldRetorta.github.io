package homeTask_19;

import java.util.Arrays;

import static homeTask_19.Book.copyBook;

public class WrapBook {

    private Book[] bookArray;
    private int capacity = 4;
    private int lastElement = 0;

    public WrapBook() {
        bookArray = new Book[capacity];
    }


    private static void copyArray(Book[] original, Book[] duplicate) {

        for (int i = 0; i < original.length; i++) {

            duplicate[i] = copyBook(original[i]);
        }
    }

    public void increase() {

        Book[] newArray = new Book[(int) (capacity * 1.5)];

        copyArray(bookArray, newArray);
        bookArray = newArray;
        capacity = newArray.length;

    }

    public void increase(int size) {

        Book[] newArray = new Book[size];

        copyArray(bookArray, newArray);
        capacity = size;

    }

    public void copy(WrapBook original) {

        if (bookArray.length < original.lastElement) {

            Book[] newArray = new Book[bookArray.length];
            bookArray = newArray;
        }

        copyArray(original.bookArray, bookArray);

        capacity = original.capacity;
        lastElement = original.lastElement;

    }

    public void add(Book book) {

        if (lastElement == bookArray.length){

            this.increase();
        }

        this.bookArray[lastElement] = book;
        lastElement++;
    }

    public Book getBook(int index) {

        if (index < 0 || index >= lastElement) {

            System.exit(-1);
        }

        return bookArray[index];
    }

    public void addAll(WrapBook addedContainer) {

        int jountSize = lastElement + addedContainer.lastElement;

        if (jountSize > bookArray.length * 1.5) {

            this.increase(jountSize);
        }

        for (int i = 0; i < addedContainer.lastElement; i++) {

            this.add(addedContainer.getBook(i));
        }
    }


    public boolean equals(WrapBook anotherBookArray) {

        if (lastElement != anotherBookArray.lastElement) {
            return false;
        }

        for (int i = 0; i < lastElement; i++) {

            if (bookArray[i].equals(anotherBookArray.bookArray[i])) {

                return true;
            }
        }

        return true;
    }

    public int find(Book book) {

        for (int i = 0; i < lastElement; i++) {

            if (bookArray[i].equals(book)) {
                return i;
            }
        }

        return -1;
    }

    public int getSize() {

        return lastElement;
    }

    public void clear() {

        for (int i = 0; i < lastElement; i++) {

            bookArray[i] = null;
        }
    }

    public void sort() {

        Arrays.sort(bookArray);

    }

    public void show() {

        for (int i = 0; i < lastElement; i++) {

            System.out.println(bookArray[i].toString());
        }
    }

}
