package eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.mediators;

import eroberer_practice.design_pattern._3_behavioral.chapter_22_mediator.flights.Flight;

import java.util.ArrayList;
import java.util.List;

public class AtaturkAirPortControlTower implements ControlTowerMediator {

    private List<Flight> flights = new ArrayList<>();

    @Override
    public void givePermission(Flight flight) {
        boolean canGivePermission = true;

        for(Flight fl : flights) {
            if (fl.isProcessing()) {
                canGivePermission = false;
                break;
            }
        }

        if (canGivePermission) {
            System.out.println("Permission is given to :" + flight.getClass().getSimpleName());
            flight.setProcessing(true);
        } else {
            System.out.println("Permission is not given to :" + flight.getClass().getSimpleName());
        }
    }

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
    }
}
