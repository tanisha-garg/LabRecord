package labrecord.lambdaandstreams;

public class Employee {
	
	String name;
	int age;
	double salary;
	String department;
	
	public Employee(String name, int age, double salary, String department) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		String text = "Name: "+name+" Age: "+age+" Salary: "+salary+" Department: "+department;
		return text;
	}

}
