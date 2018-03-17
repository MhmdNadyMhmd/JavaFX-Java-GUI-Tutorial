package closingtheprogramproperly;

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
public class ClosingTheProgramProperly extends Application {
    
    Stage window;
    Button btn;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        
        btn = new Button();
        btn.setText("Close Program");
        btn.setOnAction(e -> closeProgram());
        
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        window.setTitle("JavaFX");
        window.setScene(scene);
        window.show();
    }
    
    private void closeProgram() {
        boolean result = ConfirmBox.display("Title", "Sure you want to exit?");
        if(result)
            window.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
