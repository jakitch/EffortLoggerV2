package application;

public class UserData extends UserStories {
    private String keyWords = ""; // User key words
    private String userName = "";  // User name
    private String projectType = ""; // The type of project being completed
    private String effortType = ""; // The type of effort that will be applied to project
    private String projectStartDate = ""; // The start of the project
    private String projectEndDate = "";  // The end of the project
    private String userWorkCat = "";  // the position of the worker
    private int numDefects = 0;  // The number of defects found in the project


    // Parameterized constructor for the User Data class
    public UserData(String keyWords, String userName, String projectType, String effortType, String projectStartDate, String projectEndDate, String userWorkCat, int numDefects) {
        this.keyWords = keyWords; 
        this.userName = userName;  
        this.projectType = projectType; 
        this.effortType = effortType; 
        this.projectStartDate = projectStartDate; 
        this.projectEndDate = projectEndDate; 
        this.userWorkCat = userWorkCat; 
        this.numDefects = numDefects; 
    }  

    // Default constructor for the user Data class
    // all values set to empty
    public UserData() {
        keyWords = ""; 
        userName = ""; 
        projectType = ""; 
        effortType = ""; 
        projectStartDate = ""; 
        projectEndDate = ""; 
        userWorkCat = ""; 
        numDefects = 0; 
    } 

    // Setter for keyWords 
    // Sets the objects key words
    public void setKeyWords(String userWords) {
        this.keyWords = userWords; 
    } 

    // Getter for KeyWords 
    // Returns the user's keywords
    public String getKeyWords() {
        return this.keyWords;
    } 

    // Setter for the userName
    // Sets the object's userName  
    public void setUserName(String userUserName) {
        this.userName = userUserName; 
    }  

    // Getter for the userName
    // Returns the object's userName
    public String getUserName() {
        return this.userName;
    }  

    // Setter for the project Type 
    // Sets the objects project Type
    public void setProjectType(String userProjectType) {
        this.projectType = userProjectType; 
    }

    // Getter for the project Type 
    // Returns the objects project Type
    public String getProjectType() {
        return this.projectType; 
    }

    // Setter for the effort type
    // Sets the object's effort type
    public void setEffortType(String userEffortType) {
        this.effortType = userEffortType; 
    }

    // Getter for the effort Type 
    // Returns the object's effortType
    public String getEffortType() {
        return this.effortType; 
    }   
    
    // Setter for the project start date
    // sets the objects project start date
    public void setProjectStartDate(String userProjectStartDate) {
        this.projectStartDate = userProjectStartDate; 
    } 

    // Getter for the project start date 
    // Returns the projects start date
    public String getProjectStartDate() {
        return this.projectStartDate; 
    } 

    // Setter for the project end date
    // sets the projects end date
    public void setProjectEndDate(String userProjectEndDate) {
        this.projectEndDate = userProjectEndDate; 
    }

    // Getter for the project end date
    // Returns the projects end date
    public String getProjectEndDate() {
        return this.projectEndDate; 
    } 

    // Setter for the user Work category
    // Sets the object's work category
    public void setUserWorkCat(String userWorkCat) {
        this.userWorkCat = userWorkCat; 
    }

    // Getter for the user work category 
    // Returns the object's work category
    public String getUserWorkCat() {
        return this.userWorkCat; 
    } 

    // Setter for the user's number of defects
    // sets the object's number of defects
    public void setNumDefects(int userNumDefects) {
        this.numDefects = userNumDefects; 
    }

    // Getter for the User's number of defects
    // gets the objects number of defects 
    public int getNumDefects() {
        return this.numDefects; 
    }
    
    public String toString() {
    	String ret = "";
    	ret += "Username: " + userName + "\n";
    	ret += "Project: " + projectType + "\n";
    	ret += "Effort: " + effortType + "\n";
    	ret += "Defects: " + numDefects + "\n";
    	return ret;
    }
}
