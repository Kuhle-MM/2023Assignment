package question2;

public class Flight {
    private String flightNumber;
    private String planeNumber;
    private String arrivingOrDeparting;
    private String expectedTakeoffTime;
    private String expectedLandingTime;
    private String destinationAirport;
    private String sourceAirport;
    private boolean isInternational;


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }

    public String getArrivingOrDeparting() {
        return arrivingOrDeparting;
    }

    public void setArrivingOrDeparting(String arrivingOrDeparting) {
        this.arrivingOrDeparting = arrivingOrDeparting;
    }

    public String getExpectedTakeoffTime() {
        return expectedTakeoffTime;
    }

    public void setExpectedTakeoffTime(String expectedTakeoffTime) {
        this.expectedTakeoffTime = expectedTakeoffTime;
    }

    public String getExpectedLandingTime() {
        return expectedLandingTime;
    }

    public void setExpectedLandingTime(String expectedLandingTime) {
        this.expectedLandingTime = expectedLandingTime;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public boolean isIsInternational() {
        return isInternational;
    }

    public void setIsInternational(boolean isInternational) {
        this.isInternational = isInternational;
    }
}
