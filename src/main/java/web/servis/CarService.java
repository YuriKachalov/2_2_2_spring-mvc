package web.servis;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> carListSave();

    public List<Car> showCar(int number);
}
