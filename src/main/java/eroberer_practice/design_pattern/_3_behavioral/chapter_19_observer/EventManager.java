package eroberer_practice.design_pattern._3_behavioral.chapter_19_observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListener>> eventListeners = new HashMap<>();

    public EventManager(String... eventNames) {
        for (var eventName : eventNames) {
            eventListeners.put(eventName, new ArrayList<>());
        }
    }

    public void subscribe(String eventName, EventListener eventListener) {
        eventListeners.get(eventName).add(eventListener);
    }

    public void unsubscribe(String eventName, EventListener eventListener) {
        eventListeners.get(eventName).remove(eventListener);
    }

    public void notify(String eventName, String fileName) {
        for (EventListener eventListener : eventListeners.get(eventName)) {
            eventListener.update(eventName, fileName);
        }
    }
}
