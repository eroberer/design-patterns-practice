package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators.ControlTowerMediator;

public interface Flight {

    boolean isProcessing();
    void setProcessing(boolean processing);
    void wantPermission();
}
