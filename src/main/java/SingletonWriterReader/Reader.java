package SingletonWriterReader;

public class Reader {

    public void getNumberFromDataStorage(){
        DataStorage dataStorage = DataStorage.getInstance();
        System.out.println(dataStorage.getNumber());
    }
}
