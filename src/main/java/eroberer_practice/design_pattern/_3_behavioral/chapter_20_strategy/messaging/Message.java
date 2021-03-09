package eroberer_practice.design_pattern._3_behavioral.chapter_20_strategy.messaging;

public class Message {

    private String to;
    private String message;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
