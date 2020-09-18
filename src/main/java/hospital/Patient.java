package hospital;

public class Patient {
    private int healthLevel; //the instance data will be private
    private int bloodlevel;



    public int getHealthLevel() { //return the attribute that would be that healthlevel
        return healthLevel;//variable is created
    }

    public int getBloodLevel() {
        return bloodlevel;
    }



    //default constructor for patient object
    public Patient() {
        healthLevel = 10; //created a constructor to call out the the healthlevel, default patient health level
        bloodlevel = 20; //default patient blood level


    }
//Overloaded Constructor(constructors are very popular code blocks to overload
    public Patient(int healthLevel, int bloodlevel) {
        this.healthLevel = healthLevel;
        this.bloodlevel = bloodlevel;

    }

    public void increaseHealthLevel(int healthIncreaseAmount) { //this is the value that we are reading inside the Doctor.java
        healthLevel += healthIncreaseAmount;

    }


    public void decreaseBloodLevel(int bloodDecreaseAmount) { //this is the value that we are reading inside the Doctor.java
        bloodlevel -= bloodDecreaseAmount;
    }
}

