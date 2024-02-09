package agenda.repositories;

import agenda.entities.Turn;

import java.util.List;

public interface ClientRepositoryContract {
    void reservedTurn(Turn turn);
    List<Turn> showAllTurns();
    List<Turn> showTurnsIReserved(String nameTurn);
    void deleteMyTurn(String nameTurn);
}
