package SingletonWriterReaderVer2;

public class Writer {

    public void setDataStorage(){
        DataStorage dataStorage = DataStorage.getObject();
        dataStorage.setText("sample text");
    }
}
