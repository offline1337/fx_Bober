package aplikacja;

import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;


public class Aplikacja extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Pane root1 = new Pane();
        FlowPane root2 = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        FlowPane root3 = new FlowPane();
        
        root2.setPadding(new Insets(5));
        root2.setAlignment(Pos.BASELINE_RIGHT);
        
        //Def przycis
        Button btn = new Button("_TEST");
        //btn.setText("Say 'Hello World'");
        btn.setOnAction((event) -> {
            System.out.println("Hello World!");
            Platform.exit();
        });
        
        //Def tooltip
        Tooltip tooltip = new Tooltip("Button control");
        Tooltip.install(btn, tooltip);
        
        //Def label
        Label lbl = new Label("Simple JavaFX application.");
        lbl.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
        
        //Def text
        Text text = new Text("ZetCode");
        text.setFont(Font.font("Serif", FontWeight.BOLD, 20));

        //Figury
        Rectangle rect = new Rectangle(25, 25, 50, 50);
        rect.setFill(Color.CADETBLUE);
        
        Line line = new Line(90, 40, 230, 40);
        line.setStroke(Color.BLACK);
        
        Circle circle = new Circle(130, 130, 30);
        circle.setFill(Color.CHOCOLATE);
        
        //ID w css
        text.setId("text");
        root.setId("root");
        
        //Opcje okienka
        Scene scene = new Scene(root, 440, 200);
        scene.getStylesheets().add("styl.css");
        
        //Dodawnie
        for (int i=1; i<=20; i++) {
            root3.getChildren().add(new Button(String.valueOf(i)));
        }
        
        root1.getChildren().addAll(rect, line, circle);
        root2.getChildren().add(lbl);
        root2.getChildren().add(btn);
        root2.getChildren().addAll(text);
        //root1.getChildren().add(root2);
        root.setLeft(root1);
        //root.setLeft(btn);
        root.setCenter(root2);
        root.setRight(root3);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
