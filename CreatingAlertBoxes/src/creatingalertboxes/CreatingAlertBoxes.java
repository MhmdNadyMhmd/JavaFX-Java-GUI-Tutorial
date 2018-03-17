package creatingalertboxes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class CreatingAlertBoxes extends Application {
    
    Stage window;
    Button btn;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        btn = new Button();
        btn.setText("Click Me");
        btn.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of the window", "Are you sure you want to .....");
            System.out.println(result);
        });
        
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        window.setTitle("Hello");
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
