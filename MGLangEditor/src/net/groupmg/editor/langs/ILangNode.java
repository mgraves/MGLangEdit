package net.groupmg.editor.langs;

import javafx.scene.Node;
import javafx.scene.text.TextFlow;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.BiConsumer;
import java.util.function.Function;

public interface ILangNode {
    String getText();
    int getTextLength();

    void applyLineStyle(TextFlow textFlow);
}
