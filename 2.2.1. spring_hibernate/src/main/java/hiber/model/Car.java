package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    private String Model;

    private int series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Car() {
    }

    public Car(String model, int series) {
        Model = model;
        this.series = series;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", series=" + series +
                ", id=" + id +
                '}';
    }
}
