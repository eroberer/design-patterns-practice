package eroberer_practice.design_pattern._2_structural.chapter_14_flyweight.trees;

public class TreeType {

    private String treeName;
    private String color;

    public TreeType(String treeName, String color) {
        this.treeName = treeName;
        this.color = color;
    }

    public void draw(Integer x, Integer y) {
        String format = "%s %s tree is drawn at (%d, %d)";
        String text = String.format(format, this.color, this.treeName, x, y);

        System.out.println(text);
    }
}
