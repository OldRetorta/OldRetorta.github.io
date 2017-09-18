package home.task24;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    int count = 0;

    public DoubleLinkedList() {
    }


    public void add(String data) {

        Node newElement = new Node();
        newElement.setData(data);

        if (tail == null) {

            head = newElement;
        } else {

            tail.setNext(newElement);
        }

        newElement.setPrev(tail);
        tail = newElement;
        count++;

    }

    public String peek() {

        if (head == null) {
            System.out.println("List is empty");
            System.exit(-1);
        }
        return head.getData();
    }

    public String pop() {

        if (head == null) {
            System.out.println("List is empty");
            System.exit(-1);
        }

        String result = head.getData();
        head.setPrev(null);

        if (head.getNext() == null) {
            head = null;
        } else {
            head = head.getNext();
        }

        count--;
        return result;
    }

    public void queueProcessing(){

        while (head != null){
            System.out.println(this.pop());
        }
    }
}
