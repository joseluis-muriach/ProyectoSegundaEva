package agenda.services;

import agenda.entities.Turn;

import java.util.List;

public interface ClientServiceContract {
    void reservedTurn(Turn turn);
    List<Turn> showAllTurns();
    List<Turn> showTurnsIReserved(String nameTurn);
    void deleteMyTurn(String nameTurn);
}
