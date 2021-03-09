package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators.ControlTowerMediator;

public class Pegasus extends BaseFlight {

    public Pegasus(ControlTowerMediator controlTowerMediator) {
        super(controlTowerMediator);
    }
}
