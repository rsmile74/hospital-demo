package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties { //Doctor has a child of the Hospital Employee

    private String speciality; //speciality is the unique property of this class /The Doctor.Java extends HospitalEmployee and Implements the Medical Duties interface



    public Doctor(String employeeNumber, String name, String speciality) {
        super(employeeNumber, name); //creating the constructor //Super means that the properties are coming from the empployee
        this.speciality = speciality;
    }

    @Override
    public void careForPatient(Patient sickPatient) { //method created
        sickPatient.increaseHealthLevel(10); //method call on the patient object (increaseHealthLevel will create a method
    }

    @Override
    public void drawBloodForPatient(Patient sickPatient) { //method created
        sickPatient.decreaseBloodLevel(5); //creating method call on patient

    }

    @Override
    public int calculatePay() { //override will properly return the correct data
        return 90000;
    }


}
