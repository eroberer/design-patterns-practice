package eroberer_practice.design_pattern._3_behavioral.chapter_15_command.gui;

import java.util.List;

public class Editor {

    private String text;
    private List<Button> buttonList;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Button> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<Button> buttonList) {
        this.buttonList = buttonList;
    }
}
