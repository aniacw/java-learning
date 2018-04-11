package DoctorsAppointments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    private String name;
    private Integer surgery;
    private List<Patient> patients = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String name, Integer surgery) throws FileNotFoundException {
        this.name = name;
        this.surgery = surgery;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    File pearsonFile = new File("Pearson");
    Scanner readPearsonFile = new Scanner(pearsonFile);
    Integer pearsonAvailability = readPearsonFile.nextInt();

    File rodsonFile = new File("Rodson");
    Scanner readRodsonFile = new Scanner(rodsonFile);
    Integer rodsonAvailability = readRodsonFile.nextInt();

    File specterFile = new File("Specter");
    Scanner readSpecterFile = new Scanner(specterFile);
    Integer specterAvailability = readSpecterFile.nextInt();

    public Integer checkAvailability(String name) {
        if (name.equals("Pearson")) {
            return pearsonAvailability;
        }
        if (name.equals("Rodson")) {
            return rodsonAvailability;
        }
        if (name.equals("Specter")) {
            return specterAvailability;
        }
        return null;
    }


}
