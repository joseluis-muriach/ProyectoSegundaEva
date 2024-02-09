package agenda.services;

import agenda.entities.Hairdresser;
import agenda.entities.Turn;
import agenda.repositories.HairdresserRepositoryContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairdresserService implements HairdresserServiceContract {

    private final HairdresserRepositoryContract hairdresserRep;

    @Autowired
    public HairdresserService(HairdresserRepositoryContract hairdresserRep) {
        this.hairdresserRep = hairdresserRep;
    }

    @Override
    public void createTurn(
            Long id,
            String name,
            String date,
            String hour,
            String duration,
            boolean booked,
            Hairdresser hairdresserID) {
        Turn turn = new Turn(id, name, date, hour, duration, booked, hairdresserID);
        hairdresserRep.createTurn(turn);
    }

    @Override
    public void deleteTurn(Long id) {
        hairdresserRep.deleteTurn(id);
    }

    @Override
    public void updateTurn(Turn turn) {
        hairdresserRep.updateTurn(turn.getId(), turn);
    }

    @Override
    public List<Turn> allTurnsByHairdresser(Long id) {
        return hairdresserRep.allTurnsByHairdresser(id);
    }

    @Override
    public List<Turn> allTurns() {
        return hairdresserRep.allTurns();
    }

    @Override
    public void showTurn(String nameTurn) {

    }
}
