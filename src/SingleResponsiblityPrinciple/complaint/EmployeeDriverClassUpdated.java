package SingleResponsiblityPrinciple.complaint;

/*Breaking the class into multiple classes increases the cohesion and promotes loose coupling.
 It also ensures each classes have single responsibility and only one reason to change*/
public class EmployeeDriverClassUpdated {
	public static void main(String[] args) {
		Employee emp = new Employee("Prince Raj" , "123", "Bangalore");
		EmployeeRepository repo = new EmployeeRepository();
		repo.save(emp);
		EmployeeSalaryProcessor processor = new EmployeeSalaryProcessor();
		processor.calculateTax(emp);
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
}
class EmployeeRepository{
	public void save(Employee emp) {
		System.out.println("Saving Employee Details in DB !!");
	}
}
class EmployeeSalaryProcessor{
	public void calculateTax(Employee emp) {
		System.out.println("Calculating Tax for the Employee !!");
	}
}