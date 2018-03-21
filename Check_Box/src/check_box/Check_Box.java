package check_box;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class Check_Box extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        // checkbox
        CheckBox box1 = new CheckBox("box1");
        CheckBox box2 = new CheckBox("box2");
        
        // button
        Button btn = new Button();
        btn.setText("Order Now");
        btn.setOnAction(e -> {
            handelOptions(box1, box2);
        });
        
        // layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(box1, box2, btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        window.setTitle("CheckBox");
        window.setScene(scene);
        window.show();
    }
    
    private void handelOptions(CheckBox box1, CheckBox box2) {
        String message = "User Order: ";
        if(box1.isSelected())
            message += box1.getText() + " ";
        if(box2.isSelected())
            message += box2.getText() + " ";
        
        System.out.println(message);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
