package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTestjava {

    Surgeon underTest = new Surgeon("1" ,"name", "speciality", true);//parameters in the pre
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreaseHealthLevelFrom10To20WhenCaringForPatient(){
        underTest.careForPatient(sickPatient);
        int healthlevel = sickPatient.getHealthLevel();
        assertEquals(20, healthlevel);
    }
    @Test
    public void decreaseBloodFrom20To15WhenDrawingBlood(){ //because this is a child of the doctor this will not act any different
        underTest.drawBloodForPatient(sickPatient); //passing objects into other methods
        int bloodLevel = sickPatient.getBloodLevel(); //creating the getter
        assertEquals(15, bloodLevel);

    }
    @Test
    public void shouldExpectSalaryof100k(){
        int salary = underTest.calculatePay(); //calculate pay method
        assertEquals(100000,salary);
    }

}
