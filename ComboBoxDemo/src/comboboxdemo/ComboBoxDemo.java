package comboboxdemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class ComboBoxDemo extends Application {
    
    ComboBox<String> comboBox;
    
    @Override
    public void start(Stage primaryStage) {
        
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "one",
                "two",
                "three",
                "four"
        );
        
        comboBox.setPromptText("This is a prompt text");
        comboBox.setEditable(true);
        comboBox.setOnAction(e -> System.out.println("User Selected: " + comboBox.getValue()));
        
        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(e -> printTxt());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(comboBox, btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        primaryStage.setTitle("ComboBox Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void printTxt() {
        System.out.println(comboBox.getValue());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
