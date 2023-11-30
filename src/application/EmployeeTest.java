package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	static Engineer ron;
	static Engineer tim;
	static Supervisor brock;
	static Team team;
	
	@BeforeAll
	static void setup() {
		//Create Ron
		ron = new Engineer("Ron", "Junior Developer");
		ron.setEffortRating(6);
		ron.setNumDefects(345);
		ron.setNumCurrentProjects(1);
		ron.setNumFinishedProjects(4);
		
		//Create Tim
		tim = new Engineer("Tim", "Senior Developer");
		tim.setEffortRating(100);
		tim.setNumDefects(72);
		tim.setNumCurrentProjects(34);
		tim.setNumFinishedProjects(342);
		
		//Create Brock
		brock = new Supervisor("Brock", "Team Lead");
		team = new Team(brock);
		
		//Add Ron and Time to the team
		team.addEngineer(ron);
		team.addEngineer(tim);
	}
	
	@Test
	void testTeamGetterAndSetter() {
		Supervisor rick = new Supervisor("Rick", "King");
		team.setSupervisor(rick);
		var newSupervisor = team.getSupervisor();
		assertEquals(rick, newSupervisor);
	}
	
	@Test
	void testReport() {
		String report = "Job Title: Junior Developer\n"
				+ "Defect Count: 345\n"
				+ "Effort Rating: 6\n"
				+ "Number of Finished Projects: 4\n"
				+ "Number of Current Projects: 1";
		assertEquals(report, brock.generateReport(ron));
	}

}
