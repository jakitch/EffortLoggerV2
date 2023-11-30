package application;

import java.util.ArrayList;

//Class for a team
public class Team {
	
	//Private fields, encapsulated to prevent outside control
	private ArrayList<Engineer> engineerList;
	private Supervisor supervisor;
	
	//Constructor
	public Team(Supervisor supervisor) {
		engineerList = new ArrayList<>();
		this.supervisor = supervisor;
	}
	
	//Add engineer to a team
	public void addEngineer(Engineer engineer) {
		engineerList.add(engineer);
	}
	
	//Returns all the names of all the engineers on a team
	public String listEngineers() {
		
		String engineerString = "";
		
		for (int i = 0; i < engineerList.size(); i++) {
			engineerString += engineerList.get(i) + " ";
		}
		
		return engineerString;
	}
	
	//Getters abd setters
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}
	
	
}
