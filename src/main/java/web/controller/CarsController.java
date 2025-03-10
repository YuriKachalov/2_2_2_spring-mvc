package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.servis.CarService;
import web.servis.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {
    private final CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String showCar(Model model) {
        model.addAttribute("car", carService.carListSave());
        return "cars";
    }

//    @GetMapping("/cars")
//    public String showCarNumber(@PathVariable("numbers") int numbers, Model model) {
//        model.addAttribute("car", carService.showCar(numbers));
//        return "cars";
//    }

}
