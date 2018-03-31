package SingletonWriterReaderVer2;

import java.util.Random;

public class DataStorage {
    private static DataStorage dataStorageInstance;

    public static DataStorage getObject(){
        if(dataStorageInstance == null){
            DataStorage dataStorage = new DataStorage();
            dataStorageInstance = dataStorage;
            return dataStorage;
        } else{
            return dataStorageInstance;
        }
    }

    private int number;
    private String text;
    Random random = new Random();


    private DataStorage(){
        this.number = random.nextInt(50);
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
