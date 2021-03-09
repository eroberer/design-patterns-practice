package eroberer_practice.design_pattern._2_structural.chapter_9_bridge.abstraction;

import eroberer_practice.design_pattern._2_structural.chapter_9_bridge.implementor.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void produce() {
        String colorName = color.paintShape();
        String format = String.format("%s %s is successfully produced!", colorName, name());
        System.out.println(format);
    }

    public abstract String name();
}
