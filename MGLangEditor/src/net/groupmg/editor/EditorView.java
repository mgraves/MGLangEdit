package net.groupmg.editor;


import javafx.scene.text.TextFlow;
import org.fxmisc.richtext.GenericStyledArea;
import org.fxmisc.richtext.model.EditableStyledDocument;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.BiConsumer;
import java.util.function.Function;

import org.fxmisc.flowless.Virtualized;


public class EditorView extends GenericStyledArea<ILangNode, ILangNode, ILangNode> {
    public EditorView(ILangNode initialParagraphStyle, BiConsumer<TextFlow, ILangNode> applyParagraphStyle, ILangNode initialTextStyle, TextOps<ILangNode, ILangNode> segmentOps, Function<StyledSegment<ILangNode, ILangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, segmentOps, nodeFactory);
    }

    public EditorView(ILangNode initialParagraphStyle, BiConsumer<TextFlow, ILangNode> applyParagraphStyle, ILangNode initialTextStyle, TextOps<ILangNode, ILangNode> segmentOps, boolean preserveStyle, Function<StyledSegment<ILangNode, ILangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, segmentOps, preserveStyle, nodeFactory);
    }

    public EditorView(ILangNode initialParagraphStyle, BiConsumer<TextFlow, ILangNode> applyParagraphStyle, ILangNode initialTextStyle, EditableStyledDocument<ILangNode, ILangNode, ILangNode> document, TextOps<ILangNode, ILangNode> segmentOps, Function<StyledSegment<ILangNode, ILangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, document, segmentOps, nodeFactory);
    }

    public EditorView(ILangNode initialParagraphStyle, BiConsumer<TextFlow, ILangNode> applyParagraphStyle, ILangNode initialTextStyle, EditableStyledDocument<ILangNode, ILangNode, ILangNode> document, TextOps<ILangNode, ILangNode> segmentOps, boolean preserveStyle, Function<StyledSegment<ILangNode, ILangNode>, javafx.scene.Node> nodeFactory) {
        super(initialParagraphStyle, applyParagraphStyle, initialTextStyle, document, segmentOps, preserveStyle, nodeFactory);
    }
}
