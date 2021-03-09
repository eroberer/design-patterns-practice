package eroberer_practice.design_pattern._2_structural.chapter_14_flyweight.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeManager {

    private List<Tree> treeList;

    public TreeManager() {
        treeList = new ArrayList<>();
    }

    public void createTree(Integer x, Integer y, String treeName, String color) {
        TreeType treeType = TreeTypeFactory.getInstance().getTreeType(treeName, color);

        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    public void draw() {
        for (Tree tree : treeList) {
            tree.draw();
        }
    }
}
