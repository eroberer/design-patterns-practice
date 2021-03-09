package eroberer_practice.design_pattern._3_behavioral.chapter_19_observer;

public class Editor {

    private EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager("open", "close");
    }

    public void openFile(String path) {
        System.out.println("File is opened");
        eventManager.notify("open", path);
    }

    public void closeFile(String path) {
        System.out.println("File is closed");
        eventManager.notify("close", path);
    }

    public EventManager getEventManager() {
        return eventManager;
    }
}
