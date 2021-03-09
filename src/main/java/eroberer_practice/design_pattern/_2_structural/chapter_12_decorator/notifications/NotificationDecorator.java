package eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications;

public abstract class NotificationDecorator implements Notification {

    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void sendNotification(String message) {
        notification.sendNotification(message);
    }
}
