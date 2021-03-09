package eroberer_practice.design_pattern._3_behavioral.chapter_17_memento;

public class Application {

    public static void main(String[] args) {
        TextFile textFile = new TextFile();

        textFile.addRow(".h1 Chapter 17");
        textFile.addRow(".p Momento Design pattern");
        Memento memento = textFile.createMemento();

        System.out.println(textFile);

        textFile.addRow("Lorem ipsum dolor sit amet");
        textFile.addRow("Lorem ipsum dolor sit amet");

        System.out.println(textFile);

        textFile.setMemento(memento);

        System.out.println(textFile);

    }
}
