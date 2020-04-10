package net.groupmg.editor;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import net.groupmg.editor.langs.ILangNode;
import net.groupmg.editor.langs.Language;
import org.fxmisc.flowless.VirtualizedScrollPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditorController<LangNode extends ILangNode, Lang extends Language<LangNode>> extends VBox implements Initializable {

    @FXML
    AnchorPane editorViewAnchorPane;
    private final EditorView<LangNode, Lang> editorView;
    private final VirtualizedScrollPane<EditorView<LangNode, Lang>> virtualizedScrollPane;
    public EditorController(Lang language) {
        super();
        this.editorView = new EditorView<LangNode, Lang>(language);
        this.virtualizedScrollPane
                = new VirtualizedScrollPane<EditorView<LangNode, Lang>>(this.editorView);

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
