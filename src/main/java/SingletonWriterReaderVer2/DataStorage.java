package SingletonWriterReaderVer2;

import java.util.Random;

public class DataStorage {
    private static DataStorage dataStorageInstance;

    public static DataStorage getObject(){
        if(dataStorageInstance == null){
            DataStorage dataStorage = new DataStorage("my storage");
            dataStorageInstance = dataStorage;
            return dataStorage;
        } else {
            return dataStorageInstance;
        }
    }

    private int number;
    private String text;
    Random random = new Random();


    public DataStorage(String text){
        this.number = random.nextInt(50);
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
