package application;

import java.util.ArrayList;

public class DataFinder {
	
	// Class attributes
	private int processID;
	
	// constructor for data finder
	public DataFinder(int processID) {
		this.processID = processID;
	}
	
	// Getter for process ID
	public int getProcessID() {
		return processID;
	}
	
	// Setter for process ID
	public void setProcessID(int processID) {
		this.processID = processID;
	}
	
	public ArrayList<UserData> getRelevantData(String keyword, PsuedoDatabase database) {
		
		// Get all data from database
		var dataList = database.getData();
		
		// Initialize relevant data list
		ArrayList<UserData> relevantData = new ArrayList<>();
		
		// Scan through all the items in the data and add the matching keyword ones to the new list
		for(int i = 0; i < dataList.size(); i++) {
			if(dataList.get(i).getKeyWords().equals(keyword))
				relevantData.add(dataList.get(i));
		}
		
		return relevantData;
	}
}
