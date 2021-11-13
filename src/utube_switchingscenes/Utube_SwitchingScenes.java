package utube_switchingscenes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Utube_SwitchingScenes extends Application {
    
    Stage window;
    Scene scene1, scene2;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        
        Label lbl1 = new Label("Welcome to the first scene!");
        Button btn1 = new Button("Go to scene 2");
        btn1.setOnAction(e -> window.setScene(scene2)); 
        
        //Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(lbl1, btn1);
        scene1 = new Scene(layout1, 200, 200);
        
        //Button 2
        Button btn2 = new Button("This scene sucks, go back to scene 1");
        btn2.setOnAction(e -> window.setScene(scene1));
        
        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);
        
        window.setScene(scene1);
        window.setTitle("Yoooo");
        window.show();
        
        
    }

    
    
}
