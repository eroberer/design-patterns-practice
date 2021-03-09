package eroberer_practice.design_pattern._1_creational.chapter_6_prototype.prototype;

public class Rectangle implements ShapePrototype {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Double calculateArea() {
        return width * height;
    }

    @Override
    public ShapePrototype clone() {
        return new Rectangle(this);
    }
}
