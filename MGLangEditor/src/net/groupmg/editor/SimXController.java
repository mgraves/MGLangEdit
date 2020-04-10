package net.groupmg.editor;

import net.groupmg.editor.langs.Language;
import net.groupmg.editor.langs.simx.SimXLanguage;
import net.groupmg.editor.langs.simx.SimXNode;

public class SimXController extends EditorController<SimXNode, SimXLanguage>{
    public SimXController(SimXLanguage language) {
        super(language);
    }
}
