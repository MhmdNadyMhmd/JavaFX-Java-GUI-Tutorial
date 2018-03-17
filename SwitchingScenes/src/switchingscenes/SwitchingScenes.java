/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchingscenes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class SwitchingScenes extends Application {
    
    Stage window;
    Scene scene1, scene2;
    
    @Override
    public void start(Stage primaryStage) {
        
        window = primaryStage;
        
        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to second scene");
        button1.setOnAction(e -> {
            window.setScene(scene2);
        });
        
        // layout1 = children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);
        
        // button 2
        Button button2 = new Button("Go back to first scene");
        button2.setOnAction(e -> {
            window.setScene(scene1);
        });
        
        // layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 300, 300);
        
        window.setTitle("Title");
        window.setScene(scene1);
        window.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
