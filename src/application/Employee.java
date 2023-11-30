package application;

// Class for an employee who will use Effort Logger
public class Employee {
	
	//Private fields, encapsulated to prevent outside control
	private String name;
	private String jobTitle;
	
	//Constructor
	public Employee(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
	//Getters and setters                               .

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}
