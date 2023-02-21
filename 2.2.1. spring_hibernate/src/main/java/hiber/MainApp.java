package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Service service = context.getBean(Service.class);

        Car c1 = new Car("Toyota", 100);
        Car c2 = new Car("Ferrari", 101);
        Car c3 = new Car("Mazda", 102);
        Car c4 = new Car("Lada", 103);

        service.add(new User(c1, "User1", "Lastname1", "user1@mail.ru"));
        service.add(new User(c2, "User2", "Lastname2", "user2@mail.ru"));
        service.add(new User(c3, "User3", "Lastname3", "user3@mail.ru"));
        service.add(new User(c4, "User4", "Lastname4", "user4@mail.ru"));


        List<Car> cars = service.listCar();
        for (Car car : cars) {
            System.out.println("Id = " + car.getId());
            System.out.println("Model = " + car.getModel());
            System.out.println("Series = " + car.getSeries());
            System.out.println();
        }


        List<User> users = service.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println();
        }

        System.out.println(service.getUserByCar("Toyota", 100));

        context.close();
    }
}
