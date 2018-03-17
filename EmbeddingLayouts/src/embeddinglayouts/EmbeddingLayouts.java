package embeddinglayouts;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class EmbeddingLayouts extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
        
        VBox leftMenu = new VBox();
        Button buttonD = new Button("Prog 1");
        Button buttonE = new Button("Prog 2");
        Button buttonF = new Button("Prog 3");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        
        Scene scene = new Scene(borderPane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
