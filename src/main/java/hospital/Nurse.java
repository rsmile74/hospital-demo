package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties { //adding extends, to extend HospitalEmployee as well, *you want the nurse to act the same way as the Doctor.java. add Implements MedicalDuties


    private int numPatients;  //use code/generate/constructor/ *the EmployeeNumber and Name was removed because it is shared by the parent


    public Nurse(String employeeNumber, String name, int numPatients) {
        super(employeeNumber, name); //removed this.employeeNumber and removed name. Copying the super(employeeNumber, name) from Doctor.java, they are sibling classes
        this.numPatients = numPatients;
    }

    @Override //so you know that these have been overwitten from the interface
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawBloodForPatient(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5); //creating method call on patient

    }

    @Override //can override the payment like in Doctor.java
    public int calculatePay() {
        return 80000;
    }
}
