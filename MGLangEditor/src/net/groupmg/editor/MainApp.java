package net.groupmg.editor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        EditorController controller = new EditorController();
        primaryStage.setTitle("MGLangEditor");
        primaryStage.setScene(new Scene(controller, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    // throws an IllegalStateException if test is true
    public static void throwIf(boolean test, String message) {
        if(test) {
            throw new IllegalStateException(message);
        }
    }

}
