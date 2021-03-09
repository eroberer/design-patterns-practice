package eroberer_practice.design_pattern._1_creational.chapter_7_object_pool;

import java.util.Stack;

public class ObjectPool<T> {

    private static int MAX_OBJECT_SIZE = 10;
    private static ObjectPool instance;
    private Stack<Connection> connectionStack;

    private ObjectPool() {
        this.connectionStack = new Stack<>();
        for (int i = 0; i < MAX_OBJECT_SIZE; i++) {
            connectionStack.push(new Connection());
        }
    }

    public static synchronized ObjectPool getInstance() {
        if (instance == null) {
            instance = new ObjectPool();
        }
        return instance;
    }

    public Connection acquire() {
        if (connectionStack.isEmpty()) {
            throw new RuntimeException("Pool is empty!");
        }
        return connectionStack.pop();
    }

    public void release(Connection connection) {
        if (connection == null) {
            throw new RuntimeException("Connection must be not null!");
        }
        connectionStack.push(connection);
    }
}
