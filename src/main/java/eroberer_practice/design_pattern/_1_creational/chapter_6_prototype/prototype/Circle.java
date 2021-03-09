package eroberer_practice.design_pattern._1_creational.chapter_6_prototype.prototype;

public class Circle implements ShapePrototype {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public ShapePrototype clone() {
        return new Circle(this);
    }
}
