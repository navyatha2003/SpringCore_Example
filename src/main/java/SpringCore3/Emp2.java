package SpringCore3;

public class Emp2 implements EmployeeDetails{
	private String name;
	private String salary;
	private Department dept;
	
	private Emp2() {
		
	}
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public Emp2(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", salary=" + salary + " " + dept +" ]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		
	}

}
