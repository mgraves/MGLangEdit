package net.groupmg.editor.langs.plain;

import org.fxmisc.richtext.model.TextOps;

import java.util.Optional;

public class PlainTextOps implements TextOps<PlainNode, PlainNode> {
    @Override
    public PlainNode create(String text) {
        return new PlainNode(text);
    }

    @Override
    public int length(PlainNode plainNode) {
        return plainNode.getTextLength();
    }

    @Override
    public char charAt(PlainNode plainNode, int index) {
        final String text = getText(plainNode);
        if(index >= text.length()) {
            throw new IndexOutOfBoundsException();
        }
        return text.charAt(index);
    }

    @Override
    public String getText(PlainNode plainNode) {
        return plainNode.getText();
    }

    @Override
    public PlainNode subSequence(PlainNode plainNode, int start, int end) {
        final String substring = plainNode.getText().substring(start, end);
        return new PlainNode(substring);
    }

    @Override
    public PlainNode subSequence(PlainNode plainNode, int start) {
        final String substring = plainNode.getText().substring(start);
        return new PlainNode(substring);
    }

    @Override
    public Optional<PlainNode> joinSeg(PlainNode currentSeg, PlainNode nextSeg) {
        String joined = currentSeg.getText() + nextSeg.getText();
        return Optional.of(new PlainNode(joined));
    }

    @Override
    public PlainNode createEmptySeg() {
        return new PlainNode();
    }
}
