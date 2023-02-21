package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface Service {

    List<Car> listCar();
    void add(User user);

    List<User> listUsers();

    void add(Car car);

    User getUserByCar(String model, int series);
}
