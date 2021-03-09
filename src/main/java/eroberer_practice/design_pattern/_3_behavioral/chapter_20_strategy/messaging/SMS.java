package eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging;

public class SMS implements MessageStrategy {

    @Override
    public void send(Message message) {
        System.out.println("Calling SMS API");
        System.out.println(message);
    }
}
