package eroberer_practice.design_pattern._3_behavioral.chapter_15_command;

import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands.CopyCommand;
import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands.PasteCommand;
import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui.Button;
import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui.Editor;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setText("Lorem ipsum dolor sit amet...");


        Button copyButton = new Button("Copy Button", new CopyCommand(editor));
        Button pasteButton = new Button("Paste Button", new PasteCommand(editor));

        editor.setButtonList(List.of(copyButton, pasteButton));

        copyButton.onClick();
        pasteButton.onClick();

        System.out.println(editor.getText());
    }
}
