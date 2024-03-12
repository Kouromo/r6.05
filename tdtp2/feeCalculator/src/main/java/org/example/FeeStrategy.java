package org.example;

public interface FeeStrategy {
    double calculate(TicketType ticketType);

    boolean accept(Visitor visitor);
    // oui ou non le visiteur a l'âge de ma stratégie
}
