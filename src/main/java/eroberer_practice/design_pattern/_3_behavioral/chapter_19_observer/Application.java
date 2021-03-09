package eroberer_practice.design_pattern._3_behavioral.chapter_19_observer;

public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor();

        LogListener logListener = new LogListener();

        editor.getEventManager().subscribe("open", logListener);
        editor.getEventManager().subscribe("close", logListener);

        editor.openFile("test_file.txt");
        editor.closeFile("text2_file.txt");

        editor.getEventManager().unsubscribe("close", logListener);

        editor.openFile("333.txt");
        editor.closeFile("333.txt");
    }
}
