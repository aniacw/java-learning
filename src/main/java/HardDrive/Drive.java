package HardDrive;

public class Drive {
    private static Drive driveInstance;
    private String name;

    private Drive() {
        this.name = name;
    }

    public static Drive useDrive(String name) throws Exception {
        if (driveInstance == null) {
            Drive drive = new Drive();
            drive.name = name;
            driveInstance = drive;
            System.out.println("Drive in use: " + drive);
            return drive;
        } else {
            throw new Exception("Another drive already in use");///?????
        }
    }

//    public static Drive getDriveInstance() {
//        return driveInstance;
//    }

    @Override
    public String toString() {
        return "Drive{" +
                "name='" + name + '\'' +
                '}';
    }
}

//    public static String showVideos(int n){
//        if(n>0){
//            System.out.println(videos);
//            showVideos(n-1);
//        }
//        return null;
//    }
//