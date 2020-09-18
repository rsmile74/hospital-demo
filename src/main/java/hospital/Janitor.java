package hospital;

public class Janitor extends Administrator{ //janitor is the child to Administrator

    private boolean isCleaning; //you will only need the is isCleaning


    public Janitor(String employeeNumber,String name, String department, boolean isCleaning) { //boolean is added for isCleaning, also add in the name and department
        super(employeeNumber, name, department);
        this.isCleaning = isCleaning;
    }

    @Override
    public int calculatePay() {  //the pay is added
        return 50000;
    }
}

