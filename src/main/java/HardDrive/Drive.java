package HardDrive;

public class Drive {
    private static Drive driveInstance;
    private String name;

    private Drive() {
        this.name = name;
    }

    public static Drive useDrive(String name) {
        if (driveInstance == null) {
            Drive drive = new Drive();
            drive.name = name;
            driveInstance = drive;
            System.out.println("Drive in use: " + drive);
            return drive;
        } else {
            System.out.println("Another drive already used");
           return driveInstance;
        }
    }

    @Override
    public String toString() {
        return "Drive{" +
                "name='" + name + '\'' +
                '}';
    }
}