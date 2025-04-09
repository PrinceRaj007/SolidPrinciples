package SingleResponsiblityPrinciple.noncomplaint;

/* In this code single class Employee is having multiple responsibility like 
 saving the employee info in Db, calculating tax and also managing the employee info which 
 defeats the single responsibility principle agenda. Class should always have only one reason to 
 change but here we have multiple reason to change the Employee class for example:
 1) when underlying DB is changed, 2) when tax calculation process changes 
 3) when employee data format changes
 So to solve that we need to have multiple class each having single responsibility so that those 
 classes also hae only one reason to change*/
public class EmployeeDriverClass{
	public static void main(String[] args) {
		Employee emp = new Employee("Prince Raj" , "123", "Bangalore");
		emp.saveEmployee(emp);
		emp.calculateTax(emp);
	}
}
class Employee{
	String name;
	String id;
	String address;
	public Employee(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void saveEmployee(Employee emp) {
		System.out.println("Saving Employee in DB !!");
	}
	public void calculateTax(Employee emp) {
		System.out.println("Calcuating tax of Employee !!");
	}	
}