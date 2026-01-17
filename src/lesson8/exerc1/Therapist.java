package lesson8.exerc1;

class Therapist extends Doctor {

    @Override
    void treat() {
        System.out.println("Терапевт проводит общее лечение.");
    }

    void assignDoctor(Patient patient) {

        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon());

        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist());

        } else {
            patient.setDoctor(new Therapist());
        }

        patient.getDoctor().treat();
    }
}