package net.groupmg.editor;


import javafx.scene.text.TextFlow;
import net.groupmg.editor.langs.ILangNode;
import net.groupmg.editor.langs.Language;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.model.EditableStyledDocument;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.BiConsumer;
import java.util.function.Function;


public class EditorView<LangNode extends ILangNode, Lang extends Language<LangNode>> extends GenericStyledArea<LangNode, LangNode, LangNode> {

    public EditorView(Lang language) {
        super(language.getDefaultLineStyle(),
                language.getApplyLineStyleComsumer(),
                language.getDefaultTextStyle(),
                language.getSegmentOps(),
                language.getNodeFactory());
    }

    public EditorView(LangNode initialParagraphStyle,
                      BiConsumer<TextFlow, LangNode> applyParagraphStyle,
                      LangNode initialTextStyle,
                      TextOps<LangNode, LangNode> segmentOps,
                      Function<StyledSegment<LangNode, LangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, segmentOps, nodeFactory);
    }

    public EditorView(LangNode initialParagraphStyle,
                      BiConsumer<TextFlow, LangNode> applyParagraphStyle,
                      LangNode initialTextStyle,
                      TextOps<LangNode, LangNode> segmentOps,
                      boolean preserveStyle,
                      Function<StyledSegment<LangNode, LangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, segmentOps, preserveStyle, nodeFactory);
    }

    public EditorView(LangNode initialParagraphStyle,
                      BiConsumer<TextFlow, LangNode> applyParagraphStyle,
                      LangNode initialTextStyle,
                      EditableStyledDocument<LangNode, LangNode, LangNode> document,
                      TextOps<LangNode, LangNode> segmentOps,
                      Function<StyledSegment<LangNode, LangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, document, segmentOps, nodeFactory);
    }

    public EditorView(LangNode initialParagraphStyle,
                      BiConsumer<TextFlow, LangNode> applyParagraphStyle,
                      LangNode initialTextStyle,
                      EditableStyledDocument<LangNode, LangNode, LangNode> document,
                      TextOps<LangNode, LangNode> segmentOps,
                      boolean preserveStyle,
                      Function<StyledSegment<LangNode, LangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, document, segmentOps, preserveStyle, nodeFactory);
    }
}
