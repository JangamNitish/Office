package Employee;

public class EmployeePojo 
{

	    private int employeeId;
	    private String employeeName;
	    private int salary;
	    private String employeeType;
	    
	    public EmployeePojo(int employeeId,  String employeeName,int salary, String employeeType) {
	        //super();
	        this.employeeId = employeeId;
	        this.salary = salary;
	        this.employeeName = employeeName;
	        this.employeeType = employeeType;
	    }
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public String getEmployeeType() {
	        return employeeType;
	    }
	    public int getSalary() {
	        return salary;
	    }
}