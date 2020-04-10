package net.groupmg.editor.langs.simx;

import javafx.scene.Node;
import javafx.scene.text.TextFlow;
import net.groupmg.editor.langs.Language;
import org.fxmisc.richtext.model.StyledSegment;
import org.fxmisc.richtext.model.TextOps;

import java.util.function.Function;

public class SimXLanguage extends Language<SimXNode> {

    @Override
    public SimXNode getDefaultLineStyle() {
        return null;
    }

    @Override
    public SimXNode getDefaultTextStyle() {
        return null;
    }

    @Override
    public void applyLineStyle(TextFlow textFlow, SimXNode langNode) {

    }

    @Override
    public TextOps<SimXNode, SimXNode> getSegmentOps() {
        return null;
    }

    @Override
    public Function<StyledSegment<SimXNode, SimXNode>, Node> getNodeFactory() {
        return null;
    }
}
