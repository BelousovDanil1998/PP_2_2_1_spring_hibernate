package hiber.service;

import hiber.dao.DAO;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImp implements Service {

    @Autowired
    private DAO DAO;

    @Transactional
    @Override
    public void add(User user) {
        DAO.add(user);
    }

    @Transactional
    @Override
    public void add(Car car) {
        DAO.add(car);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return DAO.listUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> listCar() {
        return DAO.listCar();
    }
    @Transactional
    @Override
    public User getUserByCar(String model, int series) {
        return DAO.getUserByCar(model, series);
    }
}
