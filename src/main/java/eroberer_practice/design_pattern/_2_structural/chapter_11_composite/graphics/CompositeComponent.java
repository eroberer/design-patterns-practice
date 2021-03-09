package eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements Graphic {

    private List<Graphic> graphicList = new ArrayList<>();

    public void addGraphic(Graphic graphic) {
        graphicList.add(graphic);
    }

    public void removeGraphics(Graphic graphic) {
        if (graphicList.contains(graphic)) {
            graphicList.remove(graphic);
        }
    }

    @Override
    public void draw() {
        for (Graphic graphic : graphicList) {
            graphic.draw();
        }
    }
}
