package web.servis;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carListSave() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("AUDI", "red", 210));
        carList.add(new Car("LADA", "black", 100));
        carList.add(new Car("BMW", "white", 220));
        carList.add(new Car("KIA", "red", 150));
        carList.add(new Car("AUDI", "white", 210));
        return carList;
    }

    public List<Car> showCar(int number) {
        List<Car> list = carListSave().stream().limit((long) number).toList();
        if (number == 0) {
            return carListSave();
        }
        return list;
    }

}
