package hospital;

public abstract class HospitalEmployee {  //not allowed to make an object from an abstract class
    protected String employeeNumber; //attributes for the doctor
    protected String name;

    public String getName() {
        return name;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public HospitalEmployee(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber; //builds the constructor you can use the option of getters setters.
        this.name = name;
    }

    public abstract int calculatePay();



}

