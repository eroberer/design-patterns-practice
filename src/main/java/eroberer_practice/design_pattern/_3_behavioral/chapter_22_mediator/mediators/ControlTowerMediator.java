package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights.Flight;

public interface ControlTowerMediator {

    void givePermission(Flight flight);

    void addFlight(Flight flight);

}
