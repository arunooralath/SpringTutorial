package lesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Beans.xml" });
		context.registerShutdownHook();
		Group group = (FemaleTeam) context.getBean("femaleTeam");
		group.showTeamMembers();
		
//		TeamList teamList = (TeamList) context.getBean("teamList");
//		teamList.showTeamMembers();
	}

}
