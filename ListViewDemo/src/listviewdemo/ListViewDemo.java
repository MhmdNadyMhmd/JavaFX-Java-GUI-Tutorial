/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listviewdemo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nady
 */
public class ListViewDemo extends Application {
    
    ListView<String> listView;
    
    @Override
    public void start(Stage primaryStage) {
        
        listView = new ListView<>();
        listView.getItems().addAll(
                "one",
                "two",
                "three",
                "four"
        );
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(e -> btnClicked());
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(listView, btn);
        
        Scene scene = new Scene(layout, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void btnClicked() {
        String message = "";
        ObservableList<String> items;
        items = listView.getSelectionModel().getSelectedItems();
        
        for(String s:items) {
            message += s + "\n";
        }
        
        System.out.println(message);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
