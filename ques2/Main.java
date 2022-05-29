package com.ques2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of bookings: ");
		int no = sc.nextInt();
		
		System.out.print("Enter the available tickets: ");
		int av = sc.nextInt();
		ticket.setAvailableTickets(av);
		
		System.out.print("Enter the ticketid: ");
		int id = sc.nextInt();
		ticket.setTicketid(id);
		
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		ticket.setPrice(price);
		
		System.out.print("Enter the no of tickets: ");
		int nooftickets = sc.nextInt();
		
		int total_amount=ticket.calculateTicketCost(nooftickets);
		System.out.println("Total amount:"+total_amount);
		
		System.out.println("Available ticket after booking:"+ticket.getAvailableTickets());
	}

}
