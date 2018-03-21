package HardDrive;

public class Main {
    public static void main(String[] args){

        Drive drive1 = new Drive("docs1", "photos1", "videos1", "programs1");

        Drive.showDocuments(5);
        Drive.getAllData(3);
        Drive.showVideos(2);
        Drive.showPhotos(1);
        Drive.showProgramFiles(2);
    }
}
