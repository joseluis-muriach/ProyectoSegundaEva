package agenda.services;

import agenda.entities.Turn;

import java.util.List;

public interface HairdresserServiceContract {
    void createTurn(Long id,
                    String name,
                    String date,
                    String hour,
                    String duration,
                    boolean booked,
                    int hairdresserID
    );
    void deleteTurn(Long id);
    void updateTurn(Turn turn);
    List<Turn> allTurnsByHairdresser(Long id);
    List<Turn> allTurns();
    void showTurn(String nameTurn);
}
