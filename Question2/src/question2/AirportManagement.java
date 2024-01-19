package question2;

import java.util.ArrayList;
import java.util.List;

public class AirportManagement {
    private List<Flight> flights;

    public AirportManagement() {
        this.flights = new ArrayList<>();
    }

    public void createFlight(Flight flight) {
        flights.add(flight);
    }

    public void updateFlight(String flightNumber, Flight updatedFlight) {
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            if (flight.getFlightNumber().equals(flightNumber)) {
                flights.set(i, updatedFlight);
                break;
            }
        }
    }

    public void printAllFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
