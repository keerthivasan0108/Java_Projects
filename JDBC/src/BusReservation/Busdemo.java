package BusReservation;

import java.util.Scanner;
import java.sql.SQLException;

public class Busdemo {

	public static void main(String[] args) throws SQLException {
		
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();
		
		int userOpt = 1;
		try (Scanner scanner = new Scanner(System.in)) {
			while(userOpt == 1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				userOpt = scanner.nextInt();
				if(userOpt == 1) {
					Booking booking = new Booking();
					if(booking.isAvailable()) {
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(booking);
						System.out.println("Your booking is Confirmed");
					}
					else 
						System.out.println("Sorry. Bus is full. try another bus or date");
				}
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
