package extractandvalidateinput;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class ExtractAndValidateInput extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        // form
        TextField nameInput = new TextField();
        nameInput.setPromptText("Your Age");
        Button btn = new Button("Click me");
        btn.setOnAction(e -> {
            isInt(nameInput.getText());
        });
        
        // layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(nameInput, btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        window.setTitle("Hello World!");
        window.setScene(scene);
        window.show();
    }
    
    private boolean isInt(String message) {
        try {
            int age = Integer.parseInt(message);
            System.out.println("User age is: " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
