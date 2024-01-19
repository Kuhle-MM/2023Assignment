package question2;

public class PassengerFlight extends Flight {
    private int bookedPassengers;
    private int checkedInPassengers;
    private int boardedPassengers;

    public int getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(int bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public int getCheckedInPassengers() {
        return checkedInPassengers;
    }

    public void setCheckedInPassengers(int checkedInPassengers) {
        this.checkedInPassengers = checkedInPassengers;
    }

    public int getBoardedPassengers() {
        return boardedPassengers;
    }

    public void setBoardedPassengers(int boardedPassengers) {
        this.boardedPassengers = boardedPassengers;
    }
}
