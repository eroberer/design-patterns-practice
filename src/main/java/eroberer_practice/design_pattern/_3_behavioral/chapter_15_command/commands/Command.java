package eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands;

import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui.Editor;

public abstract class Command {

    protected Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract void execute();
}
