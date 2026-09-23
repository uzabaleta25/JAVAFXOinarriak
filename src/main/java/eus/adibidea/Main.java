package eus.adibidea;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        Label label = new Label("Kaixo!");
        label.setLayoutX(100);
        label.setLayoutY(100);

        Button button = new Button("Ados!");
        button.setLayoutX(300);
        button.setLayoutY(300);

        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root);

        stage.setTitle("JavaFX aplikazioa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(){
        launch();
    }
}
