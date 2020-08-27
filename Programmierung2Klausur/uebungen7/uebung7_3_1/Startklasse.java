package uebung7_3_1;

public class Startklasse {
	
	public static void main(String[] args) {

		Company company = new Company("Gemüse GmbH");

		Person person1 = new Person("Max Möhre");
		Person person2 = new Person("Hans Hafer");
		Person person3 = new Person("Lisa Lauch");
		Person person4 = new Person("David Dill");
		Person person5 = new Person("Miriam Majoran");

		Employee employee1 = new Employee(person1, 50000);
		Employee employee2 = new Employee(person2, 75000);
		Employee employee3 = new Employee(person3, 40000);
		Employee employee4 = new Employee(person4, 55000);
		Employee employee5 = new Employee(person5, 90000);

		company.addEmployee(employee1);
		company.addEmployee(employee2);
		company.addEmployee(employee3);
		company.addEmployee(employee4);
		company.addEmployee(employee5);

		company.displayCompany();
		
		try {
			employee5.setSalary(95000);
		} catch (SalaryDecreaseException e) {
			System.out.println("Gehalt zu niedrig");
		} catch (SalaryIncreaseTooHighException e) {
			System.out.println("Gehalt zu hoch");
		}

	}

}
