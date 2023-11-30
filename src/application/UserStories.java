package application;

public class UserStories {
    private String story; // User story string 
    private int points; // Number of points assigned to the task

    // Parameterized contsructor for User Stories
    public UserStories(String story, int points) {
        this.story = story;
        this.points = points; 
    }

    // Default constructor
    // sets stories and points to zero
    public UserStories() {
        this.story = "";
        this.points = 0; 
    }
    
    // Setter for the user story 
    // Sets the object's story
    public void setStory(String userStory) {
        this.story = userStory;
    }

    // Getter method for user Story 
    // returns the objects user story
    public String getStory() { 
        return this.story;
    } 

    // setter method for User points 
    // Sets the objects user points
    public void setPoints(int userPoints) {
        this.points = userPoints;
    }

    // Getter method for get points 
    // Returns the objects points
    public int getPoints() {
        return this.points; 
    }
        
}
