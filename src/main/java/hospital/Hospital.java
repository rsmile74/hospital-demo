package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Hospital {

    HashMap<String, HospitalEmployee>employeeList = new HashMap<>(); //creating the Hashmap
    HashMap<Integer,Patient> patientList = new HashMap<>();//hashmap is created for patients
    private int patientId;

    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(),employeeToHire); //the employeeList will grab all employees
    }

    public HospitalEmployee findEmployee(String employeeNumber) {
        return  employeeList.get(employeeNumber);//cast is created //the return is employeeList
    }

    public Collection<HospitalEmployee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() { //return the collection of medical employees placing it in an array list
        Collection<HospitalEmployee>medicalEmployees = new ArrayList<>();
        for(HospitalEmployee employee: employeeList.values()) { //for loop is created, everything that is the database for the employeeList, you want to pull out the MedicalEmployees
            if (employee instanceof MedicalDuties) {
                medicalEmployees.add(employee);
            }
        }
            return medicalEmployees;
    }

    public void admit(Patient patientToAdmit) { //these code means when the patient comes to the hospital the patient gets an ID
        patientId++;
        patientList.put(patientId,patientToAdmit );
    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
}
