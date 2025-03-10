package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int id;
    private String model;
    private String color;
    private int enginePower;

    public Car(int id,String model,String color, int enginePower) {
        this.model = model;
        this.enginePower = enginePower;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}

