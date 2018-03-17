package creating.a.basic.window;

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
public class CreatingABasicWindow extends Application {
    
    Button btn;
    
    @Override
    public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(e -> {
            System.out.println("Hello World!");
        });
//        (new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    @Override
//    public void handle(ActionEvent event) {
//        if(event.getSource() == btn) {
//            System.out.println("Yes, it works");
//        }
//    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
