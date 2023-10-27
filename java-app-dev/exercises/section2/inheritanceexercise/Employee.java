package exercises.section2.inheritanceexercise;

import java.util.Scanner; 
import java.text.DecimalFormat;


public class Employee extends Company{

    public int employeeId;
    public String employeeName;
    public int total_duration;
    protected DecimalFormat df = new DecimalFormat("#0.00");
    
    public Employee(int compnayId, String companyName, float wagesPerHour, int no_of_weeks) {
        super(compnayId, companyName, wagesPerHour, no_of_weeks);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        employeeId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Total Duration: ");
        total_duration = scanner.nextInt();

        scanner.close();
        
    }

    public void printInfo() {
        System.out.println("=================Employee Info=========================");
        System.out.printf("Employee Id: %d%nEmployee Name: %s%nEmployee Wages: €%s", 
                        employeeId, employeeName, df.format(this.wagesCalcluation(this.total_duration)));
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getTotal_duration() {
        return total_duration;
    }

    public void setTotal_duration(int total_duration) {
        this.total_duration = total_duration;
    }
    
}
