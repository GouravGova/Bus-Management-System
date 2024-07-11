# Bus Booking Management System

This project is a simple Bus Booking Management System implemented in Java. It allows users to book and cancel seats on a bus, and view the list of booked seats.

## Features

- **Book Seat**: Users can book a seat by providing their name and the seat number.
- **Cancel Seat**: Users can cancel a booking by providing the seat number.
- **Show Booked Seats**: Users can view all the booked seats along with the passenger names.
- **Exit**: Users can exit the application.

## Class Structure

### `Classes.java`

- **BusSeat**: Represents a seat in the bus.
  - `BusSeat(int seatNumber)`: Constructor to initialize the seat.
  - `int getSeatNumber()`: Returns the seat number.
  - `String getPassengerName()`: Returns the passenger name.
  - `boolean isBooked()`: Checks if the seat is booked.
  - `void bookSeat(String passengerName)`: Books the seat with the passenger name.
  - `void cancelSeat()`: Cancels the booking.
  - `void displaySeatInfo()`: Displays the seat information.

- **BusManagement**: Interface that defines the methods for bus management.
  - `void bookSeat(int seatNumber, String passengerName)`: Method to book a seat.
  - `void cancelSeat(int seatNumber)`: Method to cancel a seat.
  - `void showBookedSeats()`: Method to show all booked seats.

- **Bus**: Implements the `BusManagement` interface and manages an array of `BusSeat` objects.
  - `Bus(int totalSeats)`: Constructor to initialize the bus with the total number of seats.
  - `void bookSeat(int seatNumber, String passengerName)`: Books a seat if available.
  - `void cancelSeat(int seatNumber)`: Cancels a booked seat.
  - `void showBookedSeats()`: Displays all booked seats.
  - `boolean seatNumberValid(int seatNumber)`: Validates the seat number.

### `Main.java`

- **Main**: Contains the `main` method and handles user interaction.
  - `void main(String[] args)`: Main method to run the application. It provides a menu for users to book, cancel, and view booked seats, and to exit the application.


### Explanation

- **Features**: Describes what the system can do.
- **Class Structure**: Provides an overview of the classes and methods in the project.
- **Usage**: Instructions for compiling and running the application.
- **Example**: Shows a sample interaction with the application.
- **License**: States the open-source nature of the project.

This `README.md` provides a comprehensive guide to understanding and using the Bus Booking Management System.
