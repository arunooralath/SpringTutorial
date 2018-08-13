package lesson;

public class FemaleTeam implements Group {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void showTeamMembers() {
		System.out.println("Lady Employees "+ employee.toString());
	}

}
