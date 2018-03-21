/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dropdownmenu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class DropDownMenu extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        // add items
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Orange", "Another One");
        // initial value , default value must be a value already exist
        choiceBox.setValue("Apples");
        
        // button
        Button btn = new Button();
        btn.setText("Click me");
        btn.setOnAction(e -> {
            getChoice(choiceBox);
        });
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(choiceBox, btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        window.setTitle("ChoiceBox Demo");
        window.setScene(scene);
        window.show();
    }
    
    // to get the value of the selected item
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
