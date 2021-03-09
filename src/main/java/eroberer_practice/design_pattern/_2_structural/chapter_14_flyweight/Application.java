package eroberer_practice.design_pattern._2_structural.chapter_14_flyweight;

import eroberer_practice.design_pattern._2_structural.chapter_14_flyweight.trees.TreeManager;

public class Application {

    public static void main(String[] args) {
        TreeManager treeManager = new TreeManager();

        for (int i = 0; i < 10; i++) {
            treeManager.createTree(i, 10 - i, "Oak tree", "brown");
            treeManager.createTree(i, 10 - i, "Willow tree", "white brown");
        }

        treeManager.draw();
    }
}
