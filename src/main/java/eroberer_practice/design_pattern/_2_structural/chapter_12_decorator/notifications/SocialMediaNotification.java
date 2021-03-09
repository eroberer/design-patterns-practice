package eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications;

public class SocialMediaNotification extends NotificationDecorator {

    public SocialMediaNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        System.out.println("Social Media Notification is sending : " + message);
    }
}
