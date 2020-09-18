package hospital;

public abstract class Administrator extends HospitalEmployee { //creating a class called Admin which extends from HospitalEmployee

    private String department;

    public String getDepartment(){
        return department;
    }



    public Administrator(String employeeNumber, String name, String department) { //the string is changed to departement
        super(employeeNumber, name);
        this.department = department;
    } //not allowed to make an object from an abstract class
}


