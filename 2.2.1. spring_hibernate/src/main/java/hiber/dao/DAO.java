package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface DAO {

    void add(Car car);
    void add(User user);

    List<User> listUsers();

    User getUserByCar(String model, int series);
    List<Car> listCar();
}
