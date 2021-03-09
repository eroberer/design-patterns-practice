package eroberer_practice.design_pattern._1_creational.chapter_6_prototype;

import eroberer_practice.design_pattern._1_creational.chapter_6_prototype.prototype.Circle;
import eroberer_practice.design_pattern._1_creational.chapter_6_prototype.prototype.Rectangle;
import eroberer_practice.design_pattern._1_creational.chapter_6_prototype.prototype.ShapePrototype;

public class Application {

    public static void main(String[] args) {

        // Circle
        ShapePrototype circle = new Circle(2.25);
        ShapePrototype copyCircle = circle.clone();


        System.out.println(circle);
        System.out.println(circle.calculateArea());

        System.out.println(copyCircle);
        System.out.println(copyCircle.calculateArea());


        // Rectangle
        ShapePrototype rectangle = new Rectangle(4.5, 2.5);
        ShapePrototype copyRectangle = rectangle.clone();

        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());

        System.out.println(copyRectangle);
        System.out.println(copyRectangle.calculateArea());
    }
}
