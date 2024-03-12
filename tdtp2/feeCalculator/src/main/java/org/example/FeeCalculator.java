package org.example;

import java.util.List;

public class FeeCalculator {

    private static List<FeeStrategy> strategies = List.of (
            new ChildFeeStrategy(),
            new AdultFeeStrategy()
    );
    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        double fee = 0;

        // je donne la file pour que cette recherche trouve la bonne stratégie
        // adaptée ou visitée et calcule le prix correspondant
        // algo : parcours complet de la liste en comptant les stratégies qui conviennent
        //        1 seule stratégie doit être trouvée. Sinon on lèvera une exception

        int i = 0;
        int cpteurStrategiesOk = 0;
        FeeStrategy strategy;

        while (i < strategies.size()) {
            strategy = strategies.get(i);
            if (strategy.accept(visitor)) {
                cpteurStrategiesOk++;
                fee = strategy.calculate(ticketType);
            }
            i++;
        }

        // retourne fee si 1 et 1 seule stratégie a été trouvée
        if (cpteurStrategiesOk != 1) {
            throw new IllegalArgumentException("Ticket type not supported");
        }

        return fee;
    }

}
