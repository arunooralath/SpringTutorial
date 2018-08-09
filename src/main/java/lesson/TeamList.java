package lesson;

import java.util.List;

public class TeamList {

	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void showTeamMembers() {

		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

}
