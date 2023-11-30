package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
			StackPane root = new StackPane();
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//launch(args);
		getEmployeeData();
		//demonstrateFinder();
	}
	
	public static void getEmployeeData() {
		//Create John
		Engineer john = new Engineer("John", "Junior Developer");
		john.setEffortRating(3);
		john.setNumDefects(9203);
		john.setNumCurrentProjects(0);
		john.setNumFinishedProjects(2);
		
		//Create Jim
		Engineer jim = new Engineer("Jim", "Senior Developer");
		jim.setEffortRating(10);
		jim.setNumDefects(7);
		jim.setNumCurrentProjects(4);
		jim.setNumFinishedProjects(999);
		
		//Create bill
		Supervisor bill = new Supervisor("Bill", "Overlord");
		Team aTeam = new Team(bill);
		
		//Add john and jim to a team
		aTeam.addEngineer(john);
		aTeam.addEngineer(jim);
		
		
		//Bill generates reports for john and jim
		System.out.println(bill.generateReport(john));
		System.out.println();
		System.out.println(bill.generateReport(jim));
	}
	
	public static void demonstrateFinder() {
		
		//Insiitialize data
		UserData data1 = new UserData("Apple", "Ron", "Project4", "No Effort","January", "March", "Cat", 3);
		UserData data2 = new UserData("Apple", "Bob", "Project3", "No Effort","January", "March", "Cat", 6);
		UserData data3 = new UserData("Banana", "Bill", "Project1", "No Effort","January", "March", "Cat", 7);
		UserData data4 = new UserData("Orange", "Ron", "Project1", "No Effort","January", "March", "Cat", 9);
		UserData data5 = new UserData("Orange", "Ron", "Project5", "No Effort","January", "March", "Cat", 3);
		
		//Fill database
		PsuedoDatabase database = new PsuedoDatabase();
		database.insert(data1);
		database.insert(data2);
		database.insert(data3);
		database.insert(data4);
		database.insert(data5);
		
		//Initialize finder
		DataFinder finder = new DataFinder(69);
		
		// Searrch for apple
		System.out.println("Find for keyword Apple");
		
		var appleList = finder.getRelevantData("Apple", database);
		
		for(int i = 0; i < appleList.size(); i++)
			System.out.println(appleList.get(i));
		
		// Searrch for banana
		System.out.println("Find for keyword Banana");
		
		var bananaList = finder.getRelevantData("Banana", database);
		
		for(int i = 0; i < bananaList.size(); i++)
			System.out.println(bananaList.get(i));
		
		// Searrch for orange
		System.out.println("Find for keyword Orange");
		
		var orangeList = finder.getRelevantData("Orange", database);
		
		for(int i = 0; i < orangeList.size(); i++)
			System.out.println(orangeList.get(i));
		
	}
}

