package eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification is sending : " + message);
    }
}
