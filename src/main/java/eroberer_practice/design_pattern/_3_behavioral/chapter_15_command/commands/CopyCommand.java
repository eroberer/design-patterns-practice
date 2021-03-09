package eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands;

import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        System.out.println("Editor text is copied");
    }
}
