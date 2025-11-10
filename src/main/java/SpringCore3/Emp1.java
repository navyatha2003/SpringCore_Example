package SpringCore3;

public class Emp1 implements EmployeeDetails{

	private String name;
	private String salary;
	
	private Department dept;
	

	public Emp1(String name, String salary, Department dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emp1 [name=" + name + ", salary=" + salary + "," + dept + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	private Emp1() {
		
	}
	@Override
	public void working() {
		// TODO Auto-generated method stub
		
	}

}
