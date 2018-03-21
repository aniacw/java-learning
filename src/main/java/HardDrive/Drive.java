package HardDrive;

public class Drive {

    private static String documents;
    private static String photos;
    private static String videos;
    private static String programFiles;

    public Drive(String documents, String photos, String videos, String programFiles) {
        this.documents = documents;
        this.photos = photos;
        this.videos = videos;
        this.programFiles = programFiles;
    }

    public static String showVideos(int n){
        if(n>0){
            System.out.println(videos);
            showVideos(n-1);
        }
        return null;
    }

    public static String showPhotos(int n){
        if(n>0){
            System.out.println(photos);
            showPhotos(n-1);
        }
        return null;
    }

    public static String showDocuments(int n){
        if(n>0){
            System.out.println(documents);
            showDocuments(n-1);
        }
        return null;
    }

    public static String showProgramFiles(int n){
        if(n>0){
            System.out.println(programFiles);
            showProgramFiles(n-1);
        }
        return null;
    }
    public static String getAllData(int n){
        if(n>0){
            System.out.println(documents + ", " + videos + ", " + photos + ", " + programFiles);
            getAllData(n-1);
        }
        return null;
    }
}
