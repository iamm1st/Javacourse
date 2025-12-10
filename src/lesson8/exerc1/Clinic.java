package lesson8.exerc1;

public class Clinic {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.treatmentPlan = 2;

        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient);
    }
}