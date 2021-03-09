package eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands;

import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public void execute() {
        System.out.println("Running paste command!");
        editor.setText(editor.getText() + editor.getText());
    }
}
