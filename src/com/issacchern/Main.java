package com.issacchern;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * This project is Model-View-Controller
 * @author Issac
 */

public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Tech Interview Master");
		initLayout();
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void initLayout(){
		try{
			
			 FXMLLoader loader = new FXMLLoader();
	         loader.setLocation(Main.class.getResource("view/Overview.fxml"));
	         
	         rootLayout = (AnchorPane)loader.load();

	         // Show the scene csontaining the root layout.
	         Scene scene = new Scene(rootLayout);
	         primaryStage.setScene(scene);
	         primaryStage.show();
			
			
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Stage getPrimaryStage() {
        return primaryStage;
    }
}
