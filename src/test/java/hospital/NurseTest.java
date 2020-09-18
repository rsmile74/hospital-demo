package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("1" ,"name", 5);//parameters in the pre, if there are squiggly lines it is calling to create an constructor
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreaseHealthLevelFrom10to15WhenCaringForPatient(){
        underTest.careForPatient(sickPatient); //the care for patient is now going to Nurse.java
        int healthlevel = sickPatient.getHealthLevel(); //the healthlevel is coming from the patient.java
        assertEquals(15, healthlevel);
    }
    @Test
    public void decreaseBloodFrom20To15WhenDrawingBlood(){
        underTest.drawBloodForPatient(sickPatient); //click to do a method for nurse
        int bloodLevel = sickPatient.getBloodLevel(); //creating the getter
        assertEquals(15, bloodLevel);

    }
    @Test
    public void shouldExpectSalaryof90k(){
        int salary = underTest.calculatePay(); //calculate pay method
        assertEquals(80000,salary);
    }

}
