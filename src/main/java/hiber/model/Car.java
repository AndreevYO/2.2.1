package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;
    @Column
    private int series;
    @OneToOne(mappedBy = "car")
    private User user;
    public Car() {}
    public Car(String model, int series) {
        this.model=model;
        this.series=series;
    }
    public Car(String model, int series, User user) {
        this.user = user;
        this.model=model;
        this.series=series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", user=" + user +
                '}';
    }
}
