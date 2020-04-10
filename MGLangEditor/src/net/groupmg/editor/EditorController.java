package net.groupmg.editor;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class EditorController extends VBox implements Initializable {

    public EditorController() {
        final Class<?> aClass = getClass();
        final URL resourceURL = aClass.getResource("/net/groupmg/editor/EditorController.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(resourceURL);
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
