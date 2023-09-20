import java.util.*;

//class Ticket {
//    private int ticketid;
//    private int price;
//    private static int availableTickets;
//
//    public int getTicketid() {
//        return ticketid;
//    }
//
//    public void setTicketid(int ticketid) {
//        this.ticketid = ticketid;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public static int getAvailableTickets() {
//        return availableTickets;
//    }
//
//    public static void setAvailableTickets(int availableTickets) {
//        if (availableTickets >= 0) {
//            Ticket.availableTickets = availableTickets;
//        }
//    }
//
//    public int calculateTicketCost(int nooftickets) {
//        if (nooftickets <= availableTickets) {
//            availableTickets -= nooftickets;
//            return nooftickets * price;
//        } else {
//            return -1;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//
//        System.out.println("Enter no of bookings:");
//        int bookings = scanner.nextInt();
//
//        System.out.println("Enter the available tickets:");
//        int availableTickets = scanner.nextInt();
//        Ticket.setAvailableTickets(availableTickets);
//
//        for (int i = 0; i < bookings; i++) {
//            Ticket ticket = new Ticket();
//
//            System.out.println("Enter the ticketid:");
//            ticket.setTicketid(scanner.nextInt());
//
//            System.out.println("Enter the price:");
//            ticket.setPrice(scanner.nextInt());
//
//            System.out.println("Enter the no of tickets:");
//            int noOfTickets = scanner.nextInt();
//
//            int totalAmount = ticket.calculateTicketCost(noOfTickets);
//            if (totalAmount == -1) {
//                System.out.println("Tickets not available.");
//            } else {
//                System.out.println("Total amount: $" + totalAmount);
//            }
//        }
//
//        scanner.close();
//    }
//}

import java.util.*;

public class AssociateMain {
	
	public static void main(String[] args) {
	
		Associate a1= new Associate();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Associate ID: ");
		int associateId = scanner.nextInt();
		a1.setAssociateId(associateId);
		
		System.out.print("Enter Associate Name: ");
		String associateName = scanner.next();
		a1.setAssociateName(associateName);
		
		System.out.print("Enter number of days worked: ");
		int daysWorked = scanner.nextInt();
		a1.trackAssociateStatus(daysWorked);
		
		System.out.print("The associate "+a1.getAssociateName());
		System.out.print(" work status:"+a1.getWorkStatus());
		
	}

}
class Associate {
	
	private int associateId;
	private String associateName;
	private String WorkStatus;
	
	public Associate()
	{
		//System.out.println("Constructor called: ");
	}

	public int getAssociateId() {
		return associateId;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public String getWorkStatus() {
		return WorkStatus;
	}

	public void setWorkStatus(String workStatus) {
		WorkStatus = workStatus;
	}
	
	public void trackAssociateStatus(int days)
	{
		if(days>=1 && days<=20) this.WorkStatus="Learning Core Skills";
		else if(days>20 && days<=40) this.WorkStatus="Learning Advanced Modules";
		else if(days>40 && days<=60) this.WorkStatus="Project Phase";
		else this.WorkStatus="Deployed In Project";
	}
}