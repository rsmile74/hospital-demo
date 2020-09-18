package hospital;

public class Surgeon extends Doctor{ //Surgeon will be a child of Doctor.java so use extends


    private boolean isOperating; // you will only need the is isOperationg because the EmployeeName and name is for Doctor.java


    public Surgeon(String employeeNumber, String name, String speciality, boolean isOperating) { //constructor is created
        super(employeeNumber, name, speciality); //super is parent Dr.Java
        this.isOperating = isOperating;

    }
    @Override
    public int calculatePay() { //override will properly return the correct data
        return 100000;
    }
}
