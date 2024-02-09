package agenda.repositories;

import agenda.entities.Turn;

import java.util.List;

public interface HairdresserRepositoryContract {
    Turn createTurn(Turn turn);
    void deleteTurn(Long turn);
    void updateTurn(Long id, Turn turn);
    List<Turn> allTurnsByHairdresser(Long id);
    List<Turn> allTurns();
    void showTurn(String nameTurn);
}
