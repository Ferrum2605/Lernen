package uebung7_3_1;

public class Employee {

	// Attribute
	private int employeeId;
	private Person person;
	private int salary;

	// Methoden
	public Employee(Person person, int salary) {
		this.person = person;
		this.salary = salary;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return person.getName();
	}

	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) throws SalaryDecreaseException, SalaryIncreaseTooHighException
	{
		if(this.salary>salary)  //throws SalaryDecreaseException
		{
			throw new SalaryDecreaseException("Degradierung! ");
		}
		else if(this.salary*1.1>salary)
		{
			throw new SalaryIncreaseTooHighException("Gehaltserhöhunh höher als 10%");
		}
		this.salary = salary;
	}

	public void displayEmployee() {
		System.out.println(employeeId + " - " + person.getName() + " - " + salary + "€");
	}

}

