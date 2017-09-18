package home.task23;

public class SingleLinkedList {


    private Node head;
    private Node tail;
    private int count;

    public SingleLinkedList() {
    }

    public void addHead(String data) {

        Node newElement = new Node();
        newElement.setData(data);

        if (head == null) {

            this.tail = newElement;
        }

        newElement.setNext(head);
        head = newElement;
        count++;

    }

    public void addTail(String data) {

        Node newElement = new Node();
        newElement.setData(data);

        if (tail != null) {

            tail.setNext(newElement);
        } else {

            head = newElement;
        }

        tail = newElement;
        count++;

    }

    public void delOfIndex(int index) {

        if (index < 0 || index > count) {

            System.out.println("Incorrect index");
            return;
        }

        int temp = 1;
        Node beforeDelElement = head;

        while (temp < index) {

            beforeDelElement = beforeDelElement.getNext();
            temp++;
        }

        Node doomed = beforeDelElement.getNext();
        beforeDelElement.setNext(doomed.getNext());
        count--;

        if (beforeDelElement.getNext() == null) {

            tail = beforeDelElement;
        }

    }

    public void insertElement(int index, String data) {
        if (index <= 0) {

            addHead(data);
        }

        if (index >= count) {

            addTail(data);
        }

        int temp = 1;

        Node beforeInsertElement = head;

        while (temp < index - 1) {

            beforeInsertElement = beforeInsertElement.getNext();
            temp++;
        }

        Node insertElement = new Node();
        insertElement.setData(data);
        insertElement.setNext(beforeInsertElement.getNext());
        beforeInsertElement.setNext(insertElement);
        count++;
    }

    public void delList() {

        this.head = null;
    }

    public int getCount() {

        return count;
    }

    public String getIndexOf(int index) {

        if (index <= 0 && index > count) {

            System.out.println("Incorrect value");
            System.exit(-1);
        }

        Node requiredNode = head;
        int temp = 1;

        while (temp < index) {

            requiredNode = requiredNode.getNext();
            temp++;
        }

        return requiredNode.getData();

    }

    public void show() {

        Node showElement = head;
        int temp = 1;

        while (temp <= count) {

            System.out.println(showElement.getData());
            showElement = showElement.getNext();
            temp++;
        }
    }
}
