package net.groupmg.editor.langs;

import javafx.scene.Node;
import javafx.scene.text.TextFlow;
import org.fxmisc.richtext.model.SegmentOps;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class Language<LangNode extends ILangNode> {

    public abstract LangNode getDefaultLineStyle();
    public abstract LangNode getDefaultTextStyle();

    public abstract void applyLineStyle(TextFlow textFlow, LangNode langNode);
    public BiConsumer<TextFlow, LangNode> getApplyLineStyleComsumer() {
        return this::applyLineStyle;
    }

    public abstract TextOps<LangNode, LangNode> getSegmentOps();

    public abstract Function<StyledSegment<LangNode, LangNode>, Node> getNodeFactory();

}
