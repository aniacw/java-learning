package SingletonWriterReaderVer2;

public class Main {
    public static void main(String[] args){
        Reader reader = new Reader();
        Writer writer = new Writer();

        reader.readDataStorage();
        writer.setDataStorage();
    }
}
