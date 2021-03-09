package eroberer_practice.design_pattern._3_behavioral.chapter_17_memento;

public class Memento {

    private Object state;

    public Memento(Object state) {
        this.state = state;
    }

    public Object getState() {
        return state;
    }
}
