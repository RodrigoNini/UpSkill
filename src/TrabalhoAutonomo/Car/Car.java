package TrabalhoAutonomo.Car;

import Aulas.Person;

import javax.swing.*;

public class Car {
    private String brand;
    private int seats;
    private int id;
    private String registration;
    private double performance;

    private double tank;

    private boolean running =  false;

    private Person owner;

    public Car(String brand, int seats, int id, String registration, double performance) {
        this.brand = brand;
        this.seats = seats;
        this.id = id;
        this.registration = registration;
        this.performance = performance;
        tank = 100;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }


    public double fillTank(){
        return tank = 100;
    }
    public double run(int a){
        double consumption = performance*0.01;
        return (tank -= consumption*a);
    }

    public void ignition(){
        running = !running;
    }

    public void setOwner(Person person){this.owner = person; }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", seats=" + seats +
                ", id=" + id +
                ", registration='" + registration + '\'' +
                ", performance=" + performance +
                ", tank=" + tank +
                ", running=" + running +
                ", owner=" + owner +
                '}';
    }
}
