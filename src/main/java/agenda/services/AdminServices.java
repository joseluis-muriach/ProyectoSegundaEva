package agenda.services;

import agenda.entities.Hairdresser;
import agenda.repositories.AdminRepositoryContract;

import java.util.List;

public class AdminServices implements AdminServiceContract {
    private final AdminRepositoryContract ADMIN_REPOSITORY;

    public AdminServices(AdminRepositoryContract adminRepository) {
        ADMIN_REPOSITORY = adminRepository;
    }

    @Override
    public void CreateNewHairdresser() {
        ADMIN_REPOSITORY.CreateNewHairdresser();
    }

    @Override
    public void DeleteHairdresser(Hairdresser hairdresser) {
        ADMIN_REPOSITORY.DeleteHairdresser(hairdresser);
    }

    @Override
    public void updateInfoHairdresser() {
        ADMIN_REPOSITORY.updateInfoHairdresser();
    }

    @Override
    public void showInfoHairdresser(String nameHairdresser) {
        ADMIN_REPOSITORY.showInfoHairdresser(nameHairdresser);
    }

    @Override
    public List<Hairdresser> showInfoAllHairdresser() {
        return ADMIN_REPOSITORY.showInfoAllHairdresser();
    }
}
