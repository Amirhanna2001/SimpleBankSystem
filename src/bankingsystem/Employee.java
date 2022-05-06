
package bankingsystem;

public class Employee {
    private String name;    //emp name
    private double salary;  // emp salary
    private int id;        // emp id
    
    
    public Employee(String name,double salary,int id){
        this.id     = id;
        this.name   = name;
        this.salary = salary;
    }
    
    public void setEmployeeName(String name){
        this.name = name; 
    } 
    
    public void setEmployeeSalary(double salary){
        this.salary = salary;
        
    } 
    
    public String getEmployeeName(){
        return this.name;
    } 
    
    public double getEmployeeSalary(){
        return this.salary;
    } 
    
    public String toString(){
        return "Employee Id Is : "+id+" , Name : "+name+" Salary : "+salary;
    }
}
