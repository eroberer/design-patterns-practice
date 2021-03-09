package eroberer_practice.design_pattern._2_structural.chapter_9_bridge;

import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.abstraction.Circle;
import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.abstraction.Rectangle;
import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.abstraction.Shape;
import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.implementor.Blue;
import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.implementor.Red;

public class Application {

    public static void main(String[] args) {
        Shape blueCircle = new Circle(new Blue());
        blueCircle.produce();

        Shape redRectangle = new Rectangle(new Red());
        redRectangle.produce();

    }
}
