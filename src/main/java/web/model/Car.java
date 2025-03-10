package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private int enginePower;

    public Car(String model,String color, int enginePower) {
        this.model = model;
        this.enginePower = enginePower;
        this.color = color;
    }

    public List<Car> carList(Car car) {
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        return carList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

