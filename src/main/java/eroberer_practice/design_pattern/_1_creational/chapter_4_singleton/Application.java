package eroberer_practice.design_pattern._1_creational.chapter_4_singleton;

public class Application {

    public static void main(String[] args) {
        Connection connection = Connection.getInstance();

        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                System.out.println(Thread.currentThread().getName() + " " + connection);
            };
            new Thread(runnable).start();
        }
    }
}
