package SingeltonWriterReader;

public class Writer {
    private int n;

    public Writer(int n) {
        this.n = n;
    }


    public Writer createObject(Singelton.){
        Writer writer = new Writer(n);
        return writer;
    }


}
