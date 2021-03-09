package eroberer_practice.design_pattern._2_structural.chapter_12_decorator;

import eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications.EmailNotification;
import eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications.Notification;
import eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications.SMSNotification;
import eroberer_practice.design_pattern._2_structural.chapter_12_decorator.notifications.SocialMediaNotification;

public class Application {

    public static void main(String[] args) {
        String notificationMessage = "Hi, there!";

        Notification smsNotification = new SMSNotification();

        // Decorator classes
        Notification emailNotification = new EmailNotification(smsNotification);
        Notification socialMediaNotification = new SocialMediaNotification(emailNotification);

        socialMediaNotification.sendNotification(notificationMessage);
    }
}
