package HardDrive;

public class Main {
    public static void main(String[] args){

        try {
            Drive.useDrive("my drive");
        } catch (Exception e) {
            System.out.println("Drive already in use");
        }

        try {
            Drive.useDrive("my drive2");
        } catch (Exception e) {
            System.out.println("Drive already in use");
        }

        try {
            Drive.useDrive("my drive3");
        } catch (Exception e) {
            System.out.println("Drive already in use");
        }

        try {
            Drive.useDrive("my drive4");
        } catch (Exception e) {
            System.out.println("Drive already in use");
        }
    }
}