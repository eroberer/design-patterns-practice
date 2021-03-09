package eroberer_practice.design_pattern._2_structural.chapter_14_flyweight.trees;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    private final static TreeTypeFactory instance = new TreeTypeFactory();
    private Map<String, TreeType> treeTypeMap = new HashMap<>();

    private TreeTypeFactory() {
    }

    public static TreeTypeFactory getInstance() {
        return instance;
    }

    public TreeType getTreeType(String treeName, String color) {
        TreeType treeType = treeTypeMap.get(treeName);
        if (treeType == null) {
            treeType = new TreeType(treeName, color);
            treeTypeMap.put(treeName, treeType);
        }

        return treeType;
    }

}
