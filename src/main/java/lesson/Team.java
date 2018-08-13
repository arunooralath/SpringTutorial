package lesson;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Team implements InitializingBean,DisposableBean,Group {

	private Employee emp1;
	private Employee emp2;
	private Employee emp3;
	

	public Employee getEmp1() {
		return emp1;
	}

	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}

	public Employee getEmp2() {
		return emp2;
	}

	public void setEmp2(Employee emp2) {
		this.emp2 = emp2;
	}

	public Employee getEmp3() {
		return emp3;
	}

	public void setEmp3(Employee emp3) {
		this.emp3 = emp3;
	}

	public void showTeamMembers() {

		System.out.println("1 :" + getEmp1().toString());
		System.out.println("2 :" + getEmp2().toString());
		System.out.println("3 :" + getEmp3().toString());

	}

//	INITIALIZING BEAN
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init started");
	}

//	Disposing bean
	public void destroy() throws Exception {
		System.out.println("Disposing beans");
		
	}

}
