package controller;

import java.util.List;

import application.Main;
import javafx.scene.Node;

public class LayoutController {
	private static int actualPaneIndex = 0;
	private List <Node> layoutListRef ;
	public enum ActionType{
		PREVIOUS , NEXT
	};
	
	
	public LayoutController() {
		super();
		this.layoutListRef = Main.layoutListRef;
	}

	
	public void changeLayout(ActionType actionType){
		Node actualLayout = null;
		
		actualLayout = getActualLayout();
		actualLayout.setVisible(false);
		if (actionType == ActionType.PREVIOUS){
			actualPaneIndex--;
		}
		if (actionType == ActionType.NEXT){
			actualPaneIndex++;
		}
		actualLayout = getActualLayout();
		actualLayout.setVisible(true);
		
		printInfoAboutActalPaneIndex();
	}

	private Node getActualLayout(){
		return layoutListRef.get(actualPaneIndex);
	}
	
	private void printInfoAboutActalPaneIndex(){
		System.out.println("actualPaneIndex: " + actualPaneIndex);
	}
	
	
	public void setLayoutByNumber (int number){
		Node actualLayout = null;
		
		actualLayout = getActualLayout();
		actualLayout.setVisible(false);
		
		actualPaneIndex = number;
		
		actualLayout = getActualLayout();
		actualLayout.setVisible(true);
		
		printInfoAboutActalPaneIndex();
	}
	
	public static int getActualPaneIndex() {
		return actualPaneIndex;
	}
	
}
