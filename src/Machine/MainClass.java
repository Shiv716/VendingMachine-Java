package Machine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {

    // Will load the GUI:-
    @Override
    public void start(Stage primaryStage) throws IOException //throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("VendingMachine.fxml"));
        primaryStage.setTitle("Machine");
        primaryStage.setScene(new Scene(root, 570, 410));
        primaryStage.show();
    }
}
