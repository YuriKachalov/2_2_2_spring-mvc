package web.servis;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static int CAR_COUNT;
    private List<Car> carList;

    @Override
    public List<Car> carListSave() {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_COUNT,"AUDI", "red", 210));
        carList.add(new Car(++CAR_COUNT,"LADA", "black", 100));
        carList.add(new Car(++CAR_COUNT,"BMW", "white", 220));
        carList.add(new Car(++CAR_COUNT,"KIA", "red", 150));
        carList.add(new Car(++CAR_COUNT,"AUDI", "white", 210));
        return carList;
    }

    public List<Car> showCar(int number) {
        return carList.stream().limit((long) number).toList();
    }
}
