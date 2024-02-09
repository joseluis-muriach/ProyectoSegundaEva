package agenda.repositories;

import agenda.entities.Hairdresser;
import agenda.entities.Turn;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class HairdresserRepository implements HairdresserRepositoryContract {

    private final Map<Long, Turn> turns = new HashMap<>();
    private Long idIncrement = 1L;

    @Override
    public Turn createTurn(Turn turn) {
        if(turn.getId() == null) {
            turn.setId(idIncrement);
        }
        turns.put(turn.getId(), turn);
        return turn;
    }

    @Override
    public void deleteTurn(Long id) {
        turns.remove(id);
    }

    public void updateTurn(Long id, Turn turn) {
        Turn modifiedTurn = turns.get(id);
        modifiedTurn.setBooked(turn.isBooked());
        turns.put(modifiedTurn.getId(), modifiedTurn);
    }

    @Override
    public List<Turn> allTurnsByHairdresser(Long id) {
        List<Turn> filterById = new ArrayList<>();
        for(Turn turn : turns.values()) {
            if(turn.getId().equals(id)) {
                filterById.add(turn);
            }
        }
        return filterById;
    }

    @Override
    public List<Turn> allTurns() {
        return new ArrayList<>(turns.values());
    }

    @Override
    public void showTurn(String nameTurn) {

    }
}
