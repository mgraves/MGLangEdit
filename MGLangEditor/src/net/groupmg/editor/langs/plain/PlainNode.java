package net.groupmg.editor.langs.plain;

import javafx.scene.text.TextFlow;
import net.groupmg.editor.langs.ILangNode;
import org.reactfx.value.Val;
import org.reactfx.value.Var;

public class PlainNode implements ILangNode {

    private Var<String> text = Var.newSimpleVar("");

    public String getText() {
        return text.getOrElse("");
    }

    @Override
    public int getTextLength() {
        return this.getText().length();
    }

    public Val<String> textProperty() {
        return text;
    }

    public void setText(String text) {
        this.text.setValue(text);
    }

    public PlainNode() {
        this.setText("");
    }

    public PlainNode(String text) {
        this.setText(text);
    }

    @Override
    public void applyLineStyle(TextFlow textFlow) {

    }
}
