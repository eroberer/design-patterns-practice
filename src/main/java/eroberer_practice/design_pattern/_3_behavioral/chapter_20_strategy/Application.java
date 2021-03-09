package eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy;

import eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging.Message;
import eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging.MessageStrategy;
import eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging.SMS;
import eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging.Whatsapp;

public class Application {

    public static void main(String[] args) {
        Message message = new Message();
        message.setTo("Jane Doe");
        message.setMessage("What's up?");

        MessageStrategy messageStrategy = new SMS();
        messageStrategy.send(message);

        messageStrategy = new Whatsapp();
        messageStrategy.send(message);
    }
}
