package application;


//Class for an engineer
public class Engineer extends Employee {
	
	//Private fields, encapsulated to prevent outside control
	private int numDefects;
	private int effortRating;
	private int numFinishedProjects;
	private int numCurrentProjects;
	
	//Constructor
	public Engineer(String name, String jobTitle) {
		super(name, jobTitle);
	}
	
	
	// Getters and setters
	public int getNumDefects() {
		return numDefects;
	}

	public void setNumDefects(int numDefects) {
		this.numDefects = numDefects;
	}

	public int getEffortRating() {
		return effortRating;
	}

	public void setEffortRating(int effortRating) {
		this.effortRating = effortRating;
	}

	public int getNumFinishedProjects() {
		return numFinishedProjects;
	}

	public void setNumFinishedProjects(int numFinishedProjects) {
		this.numFinishedProjects = numFinishedProjects;
	}

	public int getNumCurrentProjects() {
		return numCurrentProjects;
	}

	public void setNumCurrentProjects(int numCurrentProjects) {
		this.numCurrentProjects = numCurrentProjects;
	}
	
	
}
