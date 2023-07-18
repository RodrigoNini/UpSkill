package Aulas.Aula12;

import java.sql.ClientInfoStatus;

public class Carro {
    private String licensePlate;
    private String brand;
    private  int registrationYear;

    public Carro(String licensePlate, String brand, int registrationYear){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.registrationYear = registrationYear;
    }

    @Override
    public String toString() {
        return "Matricula " + licensePlate + ", Marca: " + brand + ", Ano: " + registrationYear;
    }
}
