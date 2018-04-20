package DoctorsAppointments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Doctor dentist = new Doctor("Pearson", 10);
        Doctor gp = new Doctor("Rodson", 3);
        Doctor laryngologist = new Doctor("Specter", 7);

        List<Doctor> doctors = new ArrayList<>();

        System.out.println("Please type the doctor's name...");
        Scanner in = new Scanner(System.in);
        //String selectedDoctor;

        List<Patient> queue = new ArrayList<>();
        Patient patient1 = new Patient("Johnson", 45);
        Patient patient2 = new Patient("Jackson", 21);
        Patient patient3 = new Patient("Perry", 30);
        Patient patient4 = new Patient("Ross", 31);
        Patient patient5 = new Patient("Green", 39);
        Patient patient6 = new Patient("Reddington", 61);
        Patient patient7 = new Patient("Ford", 27);
        Patient patient8 = new Patient("Spring", 44);
        Patient patient9 = new Patient("Lucas", 20);
        Patient patient10 = new Patient("Ramsey", 35);
        Patient patient11 = new Patient("Queen", 31);
        Patient patient12 = new Patient("Gabel", 45);
        Patient patient13 = new Patient("McPhee", 58);
        Patient patient14 = new Patient("Santora", 59);
        Patient patient15 = new Patient("Anderson", 48);
        Patient patient16 = new Patient("Holm", 34);
        Patient patient17 = new Patient("Biderman", 42);
        Patient patient18 = new Patient("Henson", 25);
        Patient patient19 = new Patient("Heller", 27);
        Patient patient20 = new Patient("Smith", 37);

        queue.add(patient1);
        queue.add(patient2);
        queue.add(patient3);
        queue.add(patient4);
        queue.add(patient5);
        queue.add(patient6);
        queue.add(patient7);
        queue.add(patient8);
        queue.add(patient9);
        queue.add(patient10);
        queue.add(patient11);
        queue.add(patient12);
        queue.add(patient13);
        queue.add(patient14);
        queue.add(patient15);
        queue.add(patient16);
        queue.add(patient17);
        queue.add(patient18);
        queue.add(patient19);
        queue.add(patient20);

        do {
            String selectedDoctor = in.next();
            Integer availability = Doctor.checkAvailability(selectedDoctor);
            if (availability > 0) {
                doctors.add(new Doctor(selectedDoctor, availability));
            }
        } while (in.next() != "START") ;

        Random random = new Random();
        for (Doctor doctor: doctors){
            for (int z = 0, z < doctor.availability; z++){
                Integer patientNumber = random.nextInt(queue.size()) + 1;
                doctor.addPatient(queue.get(patientNumber));
                queue.remove(patientNumber);
            }
        }




//
//        Integer pearsonAvailability = Doctor.checkAvailability("Pearson");
//        Integer rodsonAvailability = Doctor.checkAvailability("Rodson");
//        Integer specterAvailability = Doctor.checkAvailability("Specter");

//        while (!selectedDoctor.equals("START")) {
//            try {
//                if (selectedDoctor.equals("Pearson")) {
//                    for (int i = 0; i > pearsonAvailability; i++) {
//                        Integer patientNumber = random.nextInt(queue.size()) + 1;
//                        dentist.addPatient(queue.get(patientNumber));
//                        queue.remove(patientNumber);
//                    }
//                }
//                if (selectedDoctor.equals("Rodson")) {
//                    for (int n = 0; n > rodsonAvailability; n++) {
//                        Integer patientNumber = random.nextInt(queue.size()) + 1;
//                        gp.addPatient(queue.get(patientNumber));
//                        queue.remove(patientNumber);
//                    }
//                }
//                if (selectedDoctor.equals("Specter")) {
//                    for (int m = 0; m > specterAvailability; m++) {
//                        Integer patientNumber = random.nextInt(queue.size()) + 1;
//                        laryngologist.addPatient(queue.get(patientNumber));
//                        queue.remove(patientNumber);
//                    }
//                }
//                if(selectedDoctor.equals("START")) {
//                    break;
//                }
//            } catch (Exception e) {
//                System.out.println("Doctor not found");
//            }
 //       }

       // System.out.println(dentist);
    }
}