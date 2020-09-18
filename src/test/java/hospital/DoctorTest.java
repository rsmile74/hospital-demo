package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {
    Doctor underTest = new Doctor("1" ,"name", "speciality");//parameters in the pre
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare(){
        underTest.careForPatient(sickPatient);//passing objects into other methods
        int patientHealthLevel = sickPatient.getHealthLevel(); //creating the getter
        assertEquals(20, patientHealthLevel);

    }
    @Test
    public void decreaseBloodFrom20To15WhenDrawingBlood(){
        underTest.drawBloodForPatient(sickPatient); //passing objects into other methods
        int bloodLevel = sickPatient.getBloodLevel(); //creating the getter
        assertEquals(15, bloodLevel);

    }
    @Test
    public void shouldExpectSalaryof90k(){
        int salary = underTest.calculatePay(); //calculate pay method
        assertEquals(90000,salary);
    }
}
