package application;

import java.util.ArrayList;

// mock database
public class PsuedoDatabase {
	
	//lsit of data
	private ArrayList<UserData> userDataList;
	
	// fata grabber
	public ArrayList<UserData> getData() {
		return userDataList;
	}
	
	// allows insert into the 
	public void insert(UserData userData) {
		userDataList.add(userData);
	}
	
	//constructor for database
	public PsuedoDatabase() {
		userDataList = new ArrayList<UserData>();
	}
}
