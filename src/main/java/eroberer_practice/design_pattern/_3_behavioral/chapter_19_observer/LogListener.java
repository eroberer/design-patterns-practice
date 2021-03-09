package eroberer_practice.design_pattern._3_behavioral.chapter_19_observer;

public class LogListener implements EventListener {

    @Override
    public void update(String eventName, String fileName) {
        System.out.println(String.format("Logging: %s file is %s", fileName, eventName));
    }
}
