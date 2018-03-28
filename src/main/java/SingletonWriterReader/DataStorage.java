package SingletonWriterReader;

public class DataStorage {
    private static DataStorage instance;

    public static DataStorage getInstance() {
        if (instance == null) {
            DataStorage dataStorage = new DataStorage();
            instance = dataStorage;
            return dataStorage;
        } else {
            return instance;
        }
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
