package eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui;

import eroberer_practice.design_pattern._3_behavioral.chapter_15_command.commands.Command;

public class Button {

    private String name;
    private Command command;

    public Button(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }
}
