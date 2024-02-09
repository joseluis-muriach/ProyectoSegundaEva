package agenda.services;

import agenda.entities.Turn;
import agenda.repositories.ClientRepositoryContract;

import java.util.List;

public class ClientServices implements ClientServiceContract {
    public final ClientRepositoryContract CLIENT_REPOSITORY;

    public ClientServices(ClientRepositoryContract clientRepository) {
        CLIENT_REPOSITORY = clientRepository;
    }

    @Override
    public void reservedTurn(Turn turn) {
        CLIENT_REPOSITORY.reservedTurn(turn);
    }

    @Override
    public List<Turn> showAllTurns() {
        return CLIENT_REPOSITORY.showAllTurns();
    }

    @Override
    public List<Turn> showTurnsIReserved(String nameTurn) {
        return CLIENT_REPOSITORY.showTurnsIReserved(nameTurn);
    }

    @Override
    public void deleteMyTurn(String nameTurn) {
        CLIENT_REPOSITORY.deleteMyTurn(nameTurn);
    }
}
