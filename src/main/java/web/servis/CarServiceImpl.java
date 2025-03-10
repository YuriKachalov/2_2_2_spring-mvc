package web.servis;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> carList() {
        List <Car> carList = new ArrayList<>();
        carList.add(new Car("AUDI","red",210));
        carList.add(new Car("LADA","black",100));
        carList.add(new Car("BMW","white",220));
        carList.add(new Car("KIA","red",150));
        carList.add(new Car("AUDI","white",210));
        return carList;
    }
}
