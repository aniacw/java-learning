package SingletonWriterReader;

public class Writer {

    public void setNumberToDataStorage(){
        DataStorage dataStorage = DataStorage.getInstance();
        dataStorage.setNumber(7);
    }
}
