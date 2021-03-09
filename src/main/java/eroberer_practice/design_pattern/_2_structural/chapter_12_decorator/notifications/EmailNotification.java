package eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications;

public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Email is sending : " + message);
    }
}
