package eroberer_practice.design_pattern._2_structural.chapter_11_composite;

import eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics.CompositeComponent;
import eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics.Graphic;
import eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics.Line;
import eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics.Text;

public class Application {

    public static void main(String[] args) {
        Graphic text = new Text();
        text.draw();

        CompositeComponent compositeComponent = new CompositeComponent();
        compositeComponent.addGraphic(new Line());
        compositeComponent.addGraphic(new Text());
        compositeComponent.addGraphic(new Line());
        compositeComponent.addGraphic(text);

        compositeComponent.removeGraphics(text);

        compositeComponent.draw();
    }
}
