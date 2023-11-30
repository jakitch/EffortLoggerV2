package application;

// Class for a supervisor
public class Supervisor extends Employee {
	
	// Constructor for supervisor 
	public Supervisor(String name, String jobTitle) {
		super(name, jobTitle);
	}
	
	// Generate report returns a string containing effort information about a given engineer
	public String generateReport(Engineer engineer) {
		return "Job Title: " + engineer.getJobTitle() +
				"\nDefect Count: " + engineer.getNumDefects() +
				"\nEffort Rating: " + engineer.getEffortRating() +
				"\nNumber of Finished Projects: " + engineer.getNumFinishedProjects() +
				"\nNumber of Current Projects: " + engineer.getNumCurrentProjects();
	}
}
