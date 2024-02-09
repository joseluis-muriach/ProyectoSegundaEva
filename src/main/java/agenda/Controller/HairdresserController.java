package agenda.Controller;

import agenda.entities.Hairdresser;
import agenda.services.HairdresserServiceContract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hairdresser")
public class HairdresserController {
    private final HairdresserServiceContract service;

    public HairdresserController(HairdresserServiceContract service) {
        this.service = service;
    }

    @PostMapping("/turn")
    public void createTurn(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String date,
            @RequestParam String hour,
            @RequestParam String duration,
            @RequestParam boolean booked,
            @RequestParam Hairdresser hairdresserID
    ) {
        service.createTurn(id, name, date, hour, duration, booked, hairdresserID);
    }

    @DeleteMapping("/deleteTurn{id}")
    public void deleteTurn() {

    }
}
