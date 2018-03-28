package SingletonWriterReader;

public class Main {
    public static void main(String[] args){
        Writer writer = new Writer();
        writer.setNumberToDataStorage();
        Reader reader = new Reader();
        reader.getNumberFromDataStorage();
    }
}
