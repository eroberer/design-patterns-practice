package eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging;

public class Whatsapp implements MessageStrategy {

    @Override
    public void send(Message message) {
        System.out.println("Calling WhatsApp API");
        System.out.println(message);
    }
}
