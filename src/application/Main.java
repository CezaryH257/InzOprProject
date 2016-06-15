package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

import java.util.List;

import controller.LayoutController;


public class Main extends Application {
	public static List <Node> layoutListRef;
	public static TemporaryObject tempObjRef;
	public static Stage stageRef;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			StackPane root = (StackPane)FXMLLoader.load(getClass().getResource("/view/StackPane.fxml"));
			layoutListRef = root.getChildren();
			layoutListRef.add((Node) FXMLLoader.load(getClass().getResource("/view/StartPane.fxml")));
			layoutListRef.add((Node) FXMLLoader.load(getClass().getResource("/view/Pane1.fxml")));
			layoutListRef.add((Node) FXMLLoader.load(getClass().getResource("/view/Pane2.fxml")));
			layoutListRef.add((Node) FXMLLoader.load(getClass().getResource("/view/Pane3.fxml")));
			layoutListRef.add((Node) FXMLLoader.load(getClass().getResource("/view/EndPane.fxml")));
			layoutListRef.get(0).setVisible(true);
			layoutListRef.get(1).setVisible(false);
			layoutListRef.get(2).setVisible(false);
			layoutListRef.get(3).setVisible(false);
			layoutListRef.get(4).setVisible(false);
			tempObjRef = new TemporaryObject();
			Scene scene = new Scene(root , 700,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			stageRef = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
