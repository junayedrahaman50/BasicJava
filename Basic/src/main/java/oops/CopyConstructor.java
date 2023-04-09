package oops;

class Employee{
	double salary;
	String name;
	Employee(double s, String n){
		this.salary = s;
		this.name = n;
		System.out.println("Constructor Invoked!!");
	}
	Employee(Employee e){
		this.name = e.name;
		this.salary = e.salary;
		System.out.println("Copy Constructor invoked!!");
	}
	
}


public class CopyConstructor {

	public static void main(String[] args) {
		Employee e = new Employee(50000.00, "Ramesh");
		Employee e2 = new Employee(e);
		System.out.println("============================");
		System.out.println("Name: "+ e.name);
		System.out.println("Salary: "+ e.salary);
		System.out.println("============================");
		
	}

}
