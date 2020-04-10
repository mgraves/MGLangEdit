package net.groupmg.editor.langs.plain;

import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.text.TextFlow;
import net.groupmg.editor.langs.Language;
import org.fxmisc.richtext.TextExt;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class PlainLanguage extends Language<PlainNode> {

    private PlainNode defaultLineNode = new PlainNode();
    private PlainNode plainNode = new PlainNode();
    private PlainTextOps textOps = new PlainTextOps();

    BiConsumer<? super TextExt, PlainNode> applyStyleConsumer = (t, n) -> {

    };

    public static Node createPlainTextNode(StyledSegment<PlainNode, PlainNode> seg,
                                           BiConsumer<? super TextExt, PlainNode> applyStyle) {
        TextExt t = new TextExt(seg.getSegment().getText());
        t.setTextOrigin(VPos.TOP);
        t.getStyleClass().add("text");
        applyStyle.accept(t, seg.getSegment());
        return t;
    }

    private Function<StyledSegment<PlainNode, PlainNode>, Node> nodeFactory = seg -> createPlainTextNode(seg, applyStyleConsumer);


    public PlainLanguage() {
        super();
    }

    @Override
    public PlainNode getDefaultLineStyle() {
        return this.defaultLineNode;
    }

    @Override
    public PlainNode getDefaultTextStyle() {
        return this.plainNode;
    }

    @Override
    public void applyLineStyle(TextFlow textFlow, PlainNode langNode) {
        langNode.applyLineStyle(textFlow);
    }

    @Override
    public TextOps<PlainNode, PlainNode> getSegmentOps() {
        return this.textOps;
    }

    @Override
    public Function<StyledSegment<PlainNode, PlainNode>, Node> getNodeFactory() {
        return this.nodeFactory;
    }

    public void setNodeFactory(Function<StyledSegment<PlainNode, PlainNode>, Node> nodeFactory) {
        this.nodeFactory = nodeFactory;
    }
}
