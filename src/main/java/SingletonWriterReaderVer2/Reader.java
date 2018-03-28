package SingletonWriterReaderVer2;

public class Reader {

    public void readDataStorage(){
        DataStorage dataStorage = DataStorage.getObject();
        System.out.println(dataStorage.getNumber()+ "' " + dataStorage.getText());
    }
}
