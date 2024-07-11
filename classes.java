class BusSeat {
    private int seatNumber;
    private String passengerName;

    public BusSeat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.passengerName = null;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public boolean isBooked() {
        return passengerName != null;
    }

    public void bookSeat(String passengerName) {
        this.passengerName = passengerName;
    }

    public void cancelSeat() {
        this.passengerName = null;
    }

    public void displaySeatInfo() {
        System.out.println("Seat Number: " + seatNumber + (isBooked() ? ", Passenger: " + passengerName : " is available."));
    }
}

interface BusManagement {
    void bookSeat(int seatNumber, String passengerName);
    void cancelSeat(int seatNumber);
    void showBookedSeats();
}

class Bus implements BusManagement {
    private BusSeat[] seats;

    public Bus(int totalSeats) {
        seats = new BusSeat[totalSeats];
        for (int i = 0; i < totalSeats; i++) seats[i] = new BusSeat(i + 1);
    }

    public void bookSeat(int seatNumber, String passengerName) {
        if (seatNumberValid(seatNumber)) {
            BusSeat seat = seats[seatNumber - 1];
            if (seat.isBooked()) {
                System.out.println("Seat " + seatNumber + " is already booked.");
            } else {
                seat.bookSeat(passengerName);
                System.out.println("Seat " + seatNumber + " booked by " + passengerName + ".");
            }
        }
    }

    public void cancelSeat(int seatNumber) {
        if (seatNumberValid(seatNumber)) {
            BusSeat seat = seats[seatNumber - 1];
            if (seat.isBooked()) {
                seat.cancelSeat();
                System.out.println("Seat " + seatNumber + " booking canceled.");
            } else {
                System.out.println("Seat " + seatNumber + " is not booked.");
            }
        }
    }

    public void showBookedSeats() {
        boolean found = false;
        for (BusSeat seat : seats) {
            if (seat.isBooked()) {
                seat.displaySeatInfo();
                found = true;
            }
        }
        if (!found) System.out.println("No seats are booked.");
    }

    private boolean seatNumberValid(int seatNumber) {
        if (seatNumber <= 0 || seatNumber > seats.length) {
            System.out.println("Invalid seat number.");
            return false;
        }
        return true;
    }
}
