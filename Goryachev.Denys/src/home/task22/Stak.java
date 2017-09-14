package home.task22;

public class Stak {

    char[] array;
    int topOfStak;

    public Stak(int size) {
        array = new char[size];
        topOfStak = - 1;
    }

    public void push(char c){

        if(topOfStak < array.length) {
            topOfStak++;
            array[topOfStak] = c;
        }else {

            System.out.println("Stak overflow");
            System.exit(-1);
        }

    }

    public char peek(){
        if(topOfStak < 0){

            System.out.println("Stak is empty");
            return ' ';
        }
        return array[topOfStak];
    }

    public char pop(){

        if(topOfStak < 0){

            System.out.println("Stak is empty");
            return ' ';
        }

        topOfStak--;
        return array[topOfStak + 1];

    }

    public boolean isEmpty(){

        if(topOfStak < 0){
            return true;
        }

        return false;
    }


}
