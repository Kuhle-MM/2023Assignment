package question2;

public class Question2 {

    public static void main(String[] args) {
        AirportManagement airportManagement = new AirportManagement();

        // Create some sample flights
        CargoFlight cargoFlight = new CargoFlight();
        cargoFlight.setFlightNumber("CF123");
        cargoFlight.setPlaneNumber("P123");
        // Set other attributes for cargo flight

        PassengerFlight passengerFlight = new PassengerFlight();
        passengerFlight.setFlightNumber("PF456");
        passengerFlight.setPlaneNumber("P456");
        // Set other attributes for passenger flight

        // Add the flights to the management system
        airportManagement.createFlight(cargoFlight);
        airportManagement.createFlight(passengerFlight);

        // Print all flights
        airportManagement.printAllFlights();

        // Update a flight (example)
        Flight updatedFlight = new Flight();
        updatedFlight.setFlightNumber("PF456");
        updatedFlight.setPlaneNumber("P789");
        // Set other attributes for updated flight
        airportManagement.updateFlight("PF456", updatedFlight);

        // Print all flights again
        airportManagement.printAllFlights();
    }
//Java Programming, Ninth Edition. In: Java Programming, Ninth Edition.
// Farrell, J., 2012.
// pp 1 - 406
}
