package com.dtorrez.concurrency.synchronize;

public class TicketSystem {
    private int availableTickets = 1;

    // Debemos proteger la operación completa
    public synchronized void reserveTicket() {
        if (availableTickets > 0) {

            System.out.println(
                    Thread.currentThread().getName()
                            + " reserved a ticket"
            );

            availableTickets--;
        } else {
            System.out.println("No tickets available");
        }
    }
}
