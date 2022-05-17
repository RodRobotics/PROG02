package PROG02;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JavaFX extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Firs Label in Java");
        Group root = new Group();
        root.getChildren().add(label);
        Scene scene = new Scene(root,250,150);
        primaryStage.setTitle("Titel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
