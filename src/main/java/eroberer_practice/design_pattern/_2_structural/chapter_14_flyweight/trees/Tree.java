package eroberer_practice.design_pattern._2_structural.chapter_14_flyweight.trees;

public class Tree {

    private Integer x;
    private Integer y;
    private TreeType treeType;

    public Tree(Integer x, Integer y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw() {
        treeType.draw(x, y);
    }
}
