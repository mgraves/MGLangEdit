package net.groupmg.editor.langs.simx;

import javafx.scene.text.TextFlow;
import net.groupmg.editor.langs.ILangNode;
import org.reactfx.value.Val;
import org.reactfx.value.Var;

import java.util.function.BiConsumer;

public class SimXNode implements ILangNode {

    private Var<String> text = Var.newSimpleVar("");

    @Override
    public String getText() {
        return text.getOrElse("");
    }

    public Val<String> textProperty() {
        return text;
    }

    public void setText(String text) {
        this.text.setValue(text);
    }


    @Override
    public int getTextLength() {
        return this.getText().length();
    }

    @Override
    public void applyLineStyle(TextFlow textFlow) {

    }
}
