package eus.adibidea;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Application;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        BorderPane root = new BorderPane();

        Label label = new Label("Kaixo");
        root.setTop(label);



        GridPane grid = new GridPane();
        Label izenaLbl = new Label("Izena: ");
        TextField izenaTF = new TextField("");
        Label abizenaLbl = new Label("Abizena: ");
        TextField abizenaTF = new TextField("");
        grid.add(izenaLbl,  0, 0);
        grid.add(izenaTF,  1, 0);
        grid.add(abizenaLbl,  0, 1);
        grid.add(abizenaTF,  1, 1);

        root.setCenter(grid);

        HBox hBox = new HBox();
        Button adosBttn = new Button("Ados!");
        Button utziBttn = new Button("Utzi!");
        hBox.getChildren().addAll(adosBttn, utziBttn);
        root.setBottom(hBox);

        Scene scene = new Scene(root);

        stage.setTitle("JavaFX aplikazioa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(){
        launch();
    }
}
