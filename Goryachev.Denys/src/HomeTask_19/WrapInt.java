package HomeTask_19;


import java.util.Arrays;

public class WrapInt {

    private int[] arrays;
    private int lastElement;

    public WrapInt() {

        this.arrays = new int[10];
        this.lastElement = 0;
    }

    public WrapInt(int size) {
        this.arrays = new int[size];
        this.lastElement = 0;
    }

    public int getLastElement() {
        return lastElement;
    }

    public int[] getArrays() {
        return arrays;
    }

    private void setArrays(int value, int index) {
        arrays[index] = value;
    }

    public void copy(WrapInt first) {

        for (int i = 0; i < getSize(); i++) {

            this.setArrays(first.getValue(i), i);
        }

        first.lastElement = this.lastElement;
    }

    private void enlargement() {

        int[] newArray;

        newArray = Arrays.copyOf(arrays, ((int) (this.getSize() * 1.5)));
        arrays = newArray;
    }


    private void enlargement(int size) {

        int[] newArray;

        newArray = Arrays.copyOf(arrays, size);
        arrays = newArray;
    }

    public void add(int value) {

        if (lastElement == arrays.length) {

            this.enlargement();
        }


        arrays[lastElement] = value;
        lastElement++;
    }

    public int getValue(int index) {

        if (index < 0 || index > lastElement) {

            System.out.println("Incorrect value");
            return -1;
        }

        return arrays[index];
    }

    public void addAll(WrapInt second) {

        int jointSize = this.getLastElement() + second.getLastElement();

        if (jointSize > arrays.length * 1.5) {

            this.enlargement(jointSize);

        }

        for (int i = this.lastElement; i < jointSize; i++) {

            this.add(second.getValue(i));
        }
    }


    public boolean equals(WrapInt arrays) {

        if (lastElement != arrays.getLastElement()) {
            return false;
        }

        for (int i = 0; i < lastElement; i++) {

            if (this.getValue(i) != arrays.getValue(i)) {

                return false;
            }
        }

        return true;
    }

    public void clear() {

        for (int i = 0; i < lastElement; i++) {

            setArrays(0, i);
        }
    }

    public boolean contains(int value) {

        for (int i = 0; i < lastElement; i++) {

            if (value == this.getValue(i)) {

                return true;
            }
        }

        return false;
    }

    public int getIndex(int value) {

        int index;

        for (int i = 0; i < lastElement; i++) {

            if (value == this.getValue(i)) {
                return i;
            }
        }

        return -1;
    }

    public int getSize() {

        return this.getArrays().length;
    }

    public void show() {

        System.out.println(Arrays.toString(this.getArrays()));
    }


}
