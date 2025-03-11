package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarService;
import web.servis.CarServiceImpl;

@Controller
public class CarsController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String showCarNumber(@RequestParam(value = "count", required = false) Integer numbers, Model model) {
        if (numbers == null) {
            model.addAttribute("car", carService.carListSave());
        } else {
            model.addAttribute("car", carService.showCar(numbers));
        }
        return "cars";
    }
}
