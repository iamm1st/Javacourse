package lesson8.exerc1;

class Therapist extends Doctor {
    @Override
    void treat() {
        System.out.println("Терапевт проводит общее лечение.");
    }

    void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            patient.doctor = new Surgeon();
        } else if (patient.treatmentPlan == 2) {
            patient.doctor = new Dentist();
        } else {
            patient.doctor = new Therapist();
        }

        patient.doctor.treat();
    }
}