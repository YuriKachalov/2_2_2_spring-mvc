package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.Car;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCar() {
//        model.addAttribute("car", car.carList(car));
        return "pages/cars";
    }

//    @PostMapping("/add")
}
