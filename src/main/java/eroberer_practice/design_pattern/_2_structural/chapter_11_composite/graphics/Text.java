package eroberer_practice.design_pattern._2_structural.chapter_11_composite.graphics;

public class Text implements Graphic {

    @Override
    public void draw() {
        System.out.println("Drawing Text component!");
    }
}
