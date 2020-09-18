package hospital;
//starting our collection

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {
    Hospital underTest = new Hospital(); //create the class //in the parentheses everything is carried over from what we created in the classes
    Doctor doctor = new Doctor("1", "doctor name", "speciality");
    Nurse nurse = new Nurse("2", "nurse name", 5);
    Janitor janitor = new Janitor("3", "janitor name", "maternity wing", true);

    @Test
    public void shouldBeAbleToHireADoctor() {
        underTest.hire(doctor); //method is created
        HospitalEmployee foundDoctor = underTest.findEmployee("1"); //this is the primary key //findEmployee method is created
        assertEquals("doctor name", foundDoctor.getName());//the getName needs to go to HospitalEmployee.Java
    }

    @Test
    public void shouldBeAbleToHireADoctorNurseAndJanitor() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1"); //creating all the employees
        HospitalEmployee foundNurse = underTest.findEmployee("2");
        HospitalEmployee foundJanitor = underTest.findEmployee("3");
        assertEquals("doctor name", foundDoctor.getName());
        assertEquals("nurse name", foundNurse.getName());
        assertEquals("janitor name", foundJanitor.getName());

    }

    @Test
    public void shouldBeAbleToHireACollectionOfEmployees() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> hireEmployees = underTest.getAllEmployees();//method is created from getAllEmployees
        assertThat(hireEmployees, containsInAnyOrder(doctor, nurse, janitor));

    }

    @Test
    public void shouldDisplayAllMedicalPersonnel() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        Collection<HospitalEmployee> medicalEmployees = underTest.getMedicalEmployees();//method is created from getMedicalEmployees
        assertThat(medicalEmployees, containsInAnyOrder(doctor, nurse));

    }

    @Test
    public void shouldAdmitTwoPatients(){
        Patient sickPatient = new Patient(); //default patient
        Patient sickerPatient = new Patient(5,10);//constructors are created
        underTest.admit(sickPatient); //method is created and an array will be needed
        underTest.admit(sickerPatient);
        Collection<Patient> admittedPatients = underTest.getAllPatients();//getAllPatients need method created
        assertThat(admittedPatients,containsInAnyOrder(sickPatient, sickerPatient));
    }
}
