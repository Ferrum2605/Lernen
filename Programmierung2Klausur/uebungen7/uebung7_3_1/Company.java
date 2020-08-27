package uebung7_3_1;

import java.util.ArrayList;

public class Company {

	// Attribute
	private String name;
	private ArrayList<Employee> employees;
	private int noEmployees;

	// Methoden
	public Company(String name) {
		this.name = name;
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		noEmployees++;
		employee.setEmployeeId(noEmployees);
		employees.add(employee);
	}

	public void displayCompany() {
		System.out.println(name);
		System.out.println();
		for (Employee employee : employees) {
			employee.displayEmployee();
		}
	}

}
