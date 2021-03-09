package eroberer_practice.design_pattern._2_structural.chapter_9_bridge.abstraction;

import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.implementor.Color;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String name() {
        return "Rectangle";
    }
}
