package eroberer_practice.design_pattern._2_structural.chapter_13_proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject is invoked");
    }
}
