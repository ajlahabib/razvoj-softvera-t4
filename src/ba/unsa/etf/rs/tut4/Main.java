package ba.unsa.etf.rs.tut4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.stage.Stage.*;

public class Main extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Program.fxml"));
        stage.setTitle("Kasa");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();


    }
}

