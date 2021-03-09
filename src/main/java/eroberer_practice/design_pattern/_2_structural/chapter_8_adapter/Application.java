package eroberer_practice.design_pattern._2_structural.chapter_8_adapter;

import eroberer_practice.design_pattern._2_structural.chapter_8_adapter.internal.InternalSystem;
import eroberer_practice.design_pattern._2_structural.chapter_8_adapter.internal.ExternalSystemAdapter;

public class Application {

    public static void main(String[] args) {

        InternalSystem internalSystem = new ExternalSystemAdapter();

        internalSystem.doSomething();
    }
}
