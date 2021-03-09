package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights.Flight;
import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights.Pegasus;
import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights.Thy;
import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators.AtaturkAirPortControlTower;
import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators.ControlTowerMediator;

public class Application {

    public static void main(String[] args) {
        ControlTowerMediator controlTowerMediator = new AtaturkAirPortControlTower();

        Flight thy = new Thy(controlTowerMediator);
        Flight pegasus = new Pegasus(controlTowerMediator);

        thy.wantPermission();
        pegasus.wantPermission();

        thy.setProcessing(false);
        pegasus.wantPermission();
    }
}
