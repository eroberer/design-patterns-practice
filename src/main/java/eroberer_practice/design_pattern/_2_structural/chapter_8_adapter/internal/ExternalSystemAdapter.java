package eroberer_practice.design_pattern._2_structural.chapter_8_adapter.internal;

import eroberer_practice.design_pattern._2_structural.chapter_8_adapter.external.ExternalSystem;

public class ExternalSystemAdapter implements InternalSystem {

    @Override
    public void doSomething() {
        new ExternalSystem().doAnotherThing();
    }
}
