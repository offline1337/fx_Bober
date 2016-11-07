/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacja;

import java.awt.Insets;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author student
 */
public class Aplikacja extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("_TEST");
        //btn.setText("Say 'Hello World'");
        btn.setOnAction((event) -> {
            System.out.println("Hello World!");
            Platform.exit();
        });

        HBox root = new HBox();
        
        Tooltip tooltip = new Tooltip("Button control");
        Tooltip.install(btn, tooltip);
               
        Label lbl = new Label("Simple JavaFX application.");
        lbl.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
        
        Text text = new Text("ZetCode");
        text.setFont(Font.font("Serif", FontWeight.BOLD, 76));
        
        text.setId("text");
        root.setId("root");
        
        Scene scene = new Scene(root, 600, 200);
        scene.getStylesheets().add("styl.css");
        
        root.getChildren().add(lbl);
        root.getChildren().add(btn);
        root.getChildren().addAll(text);
        
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
