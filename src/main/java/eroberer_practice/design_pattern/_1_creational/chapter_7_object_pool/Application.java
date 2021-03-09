package eroberer_practice.design_pattern._1_creational.chapter_7_object_pool;

public class Application {

    public static void main(String[] args) {
        Connection connection = null;
        for (int i = 0; i < 10; i++) {
            connection = ObjectPool.getInstance().acquire();

            System.out.println(connection);
        }

        // Pool is empty
        try {
            connection = ObjectPool.getInstance().acquire();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        ObjectPool.getInstance().release(connection);
        // Pool is not empty

        connection = ObjectPool.getInstance().acquire();
        System.out.println(connection);
    }
}
