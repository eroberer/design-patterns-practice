package eroberer_practice.design_pattern._3_behavioral.chapter_17_memento;

import java.util.ArrayList;
import java.util.List;

public class TextFile {

    private List<String> rows;

    public TextFile() {
        this.rows = new ArrayList<>();
    }

    public void addRow(String row) {
        rows.add(row);
    }

    public Memento createMemento() {
        return new Memento(List.copyOf(rows));
    }

    public void setMemento(Memento memento) {
        this.rows = (List<String>) memento.getState();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (String row : rows) {
            stringBuilder.append("ROW :\t");
            stringBuilder.append(row);
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
