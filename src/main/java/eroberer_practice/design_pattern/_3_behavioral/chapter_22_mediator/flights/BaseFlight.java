package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators.ControlTowerMediator;

public abstract class BaseFlight implements Flight {

    private Boolean processing = false;
    private ControlTowerMediator controlTowerMediator;

    public BaseFlight(ControlTowerMediator controlTowerMediator) {
        this.controlTowerMediator = controlTowerMediator;
        controlTowerMediator.addFlight(this);
    }

    @Override
    public void wantPermission() {
        this.controlTowerMediator.givePermission(this);
    }

    @Override
    public boolean isProcessing() {
        return processing;
    }

    @Override
    public void setProcessing(boolean processing) {
        this.processing = processing;
    }
}
