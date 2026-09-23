package eus.adibidea;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        StackPane root = new StackPane();
        Scene scene = new Scene(root);

        stage.setTitle("JavaFX aplikazioa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(){
        launch();
    }
}
