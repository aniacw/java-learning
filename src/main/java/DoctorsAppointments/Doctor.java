package DoctorsAppointments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Doctor {
    private String name;
    private Integer availability;
    private List<Patient> patients = new ArrayList<>();

    public Doctor() {
    }

    public Doctor(String name) {
        this.name = name;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public Integer loadAvailability() {
        try {
            File file = new File(this.name);
            Scanner reader = new Scanner(file);
            this.availability = reader.nextInt();
        } catch (FileNotFoundException e) {
            return this.availability = 0;
        }
        return this.availability;
    }

    public Integer getAvailability() {
        return availability;
    }
}