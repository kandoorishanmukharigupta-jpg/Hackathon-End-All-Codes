 class CinemaBooking {
    String movieName;
    double ticketPrice;
    int numTickets;
    String customerName;
    
         CinemaBooking(String movieName, double ticketPrice, int numTickets, String customerName) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numTickets = numTickets;
        this.customerName = customerName;
    }
    
    
        CinemaBooking(String movieName, double ticketPrice, int numTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numTickets = numTickets;
        this.customerName = "Guest";
    }
 
        double bookTickets() {
        return numTickets * ticketPrice; 
    }
    
     
        double bookTickets(double extraCharge) {
        return (numTickets * ticketPrice) + extraCharge;
    }
    
     
        void displayBooking() {
        double total = bookTickets();
        double discount = 0;
        
        if (numTickets >= 5) {
            discount = total * 0.10;
        }
        
        double finalAmount = total - discount;
        
        System.out.println("Customer Name      : " + customerName.toUpperCase());
        System.out.println("Movie Name         : " + movieName.toUpperCase());
        System.out.println("Ticket Price       : Rs. " + ticketPrice);
        System.out.println("Number of Tickets  : " + numTickets);
        System.out.println();
        
        if (numTickets > 0) {
            System.out.println("Booking Status      : Booking Successful");
            System.out.println("Total Amount         : Rs. " + total);
            System.out.println("Discount                : Rs. " + discount);
            System.out.println("Final Amount         : Rs. " + finalAmount);
        } else {
            System.out.println("Booking Status     : Booking Failed");
        }
        System.out.println();
    }
}

          public class MovieBill {
          public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");
        System.out.println();
        
        CinemaBooking b1 = new CinemaBooking("Avatar", 200, 5, "Sneha");
        b1.displayBooking();
        
        CinemaBooking b2 = new CinemaBooking("Avatar", 200, 2, "Arjun");
        b2.displayBooking();
        
        // Compare names
        String name1 = "Sneha";
        String name2 = "Sneha";
        
        if (name1.equals(name2)) {
            System.out.println("Customer Verification: Names Match");
        } else {
            System.out.println("Customer Verification: Names Don't Match");
        }
        
        System.out.println("=============================================");
    }
}