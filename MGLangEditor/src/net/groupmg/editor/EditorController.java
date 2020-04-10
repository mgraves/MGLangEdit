package net.groupmg.editor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.StyledTextArea;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;

public class EditorController extends VBox implements Initializable {

    @FXML
    AnchorPane editorViewAnchorPane;

    private final CodeArea textArea = new CodeArea();
    private final VirtualizedScrollPane<CodeArea> virtualizedScrollPane = new VirtualizedScrollPane<CodeArea>(this.textArea);
    private final VBox contentVBox = new VBox(this.virtualizedScrollPane);

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
        MainApp.throwIf(this.editorViewAnchorPane == null, "this.editorViewAnchorPane == null");
        AnchorPane.setLeftAnchor(this.virtualizedScrollPane, 0.0);
        AnchorPane.setTopAnchor(this.virtualizedScrollPane, 0.0);
        AnchorPane.setRightAnchor(this.virtualizedScrollPane, 0.0);
        AnchorPane.setBottomAnchor(this.virtualizedScrollPane, 0.0);
        this.editorViewAnchorPane.getChildren().add(virtualizedScrollPane);
    }
}
