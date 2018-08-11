package lesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Beans.xml" });
		Team team = (Team) context.getBean("team");
		team.showTeamMembers();
		
//		TeamList teamList = (TeamList) context.getBean("teamList");
//		teamList.showTeamMembers();
	}

}
