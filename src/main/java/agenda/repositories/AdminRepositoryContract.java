package agenda.repositories;

import agenda.entities.Hairdresser;

import java.util.List;

public interface AdminRepositoryContract {
        void CreateNewHairdresser();
        void DeleteHairdresser(Hairdresser hairdresser);
        void updateInfoHairdresser();
        void showInfoHairdresser(String nameHairdresser);
        List<Hairdresser> showInfoAllHairdresser();
}
