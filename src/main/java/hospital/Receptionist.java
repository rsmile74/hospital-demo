package hospital;

public class Receptionist extends Administrator{ //receptionist is the child to Administrator *constructor is also created

    private boolean isOnPhone; //you will only need the is isOnPhone

    public Receptionist(String employeeNumber, String name, String department, boolean isOnPhone) { //add boolean called isOnPhone
        super(employeeNumber, name, department);
        this.isOnPhone = isOnPhone;
    }




    @Override
    public int calculatePay() { //the pay is added
        return 50000;
    }
}
