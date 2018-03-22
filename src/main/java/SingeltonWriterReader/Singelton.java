package SingeltonWriterReader;

public class Singelton {
    public static int myNumber = 5;

    private Singelton(int myNumber) {
        this.myNumber = myNumber;
    }

    public  int getMyNumber() {
        return myNumber;
    }
}
