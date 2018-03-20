package gridpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class GridPane extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        javafx.scene.layout.GridPane grid = new javafx.scene.layout.GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        // name label
        Label nameLabel = new Label("Username");
        javafx.scene.layout.GridPane.setConstraints(nameLabel, 0, 0);
        
        // name input
        TextField nameInput = new TextField();
        nameInput.setPromptText("Username");
        javafx.scene.layout.GridPane.setConstraints(nameInput, 1, 0);
        
        // password label
        Label passLabel = new Label("Password");
        javafx.scene.layout.GridPane.setConstraints(passLabel, 0, 1);
        
        // password input
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Your password");
        javafx.scene.layout.GridPane.setConstraints(passwordField, 1, 1);
        
        // login button 
        Button loginBtn = new Button("Login");
        javafx.scene.layout.GridPane.setConstraints(loginBtn, 1, 2);
        
        grid.getChildren().addAll(nameLabel, nameInput, passLabel, passwordField, loginBtn);
                
        Scene scene = new Scene(grid, 300, 250);
        
        window.setTitle("GridPane Layout");
        window.setScene(scene);
        window.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
