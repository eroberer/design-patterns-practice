package eroberer_practice.design_pattern._1_creational.chapter_4_singleton;

public class Connection {

    private static volatile Connection instance = null;
    private static Object lock = new Object();

    private Connection(Integer poolSize) {
        // implementation
    }

    public static Connection getInstance() {
        if (instance == null) {
            // sync double check
            synchronized (lock) {
                if (instance == null) {
                    instance = new Connection(10);
                }
            }
        }
        return instance;
    }
}
