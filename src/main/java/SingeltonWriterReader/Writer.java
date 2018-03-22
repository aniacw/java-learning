package SingeltonWriterReader;

public class Writer {
    private int n;

    public Writer(int n) {
        this.n = Singelton.myNumber;
    }

    public Writer createObject(int n){
        Writer writer = new Writer(n);
        return writer;
    }

    public int getNumber(){
        return n;
    }


}
