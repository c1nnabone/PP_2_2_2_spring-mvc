package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> listOfCars = new ArrayList<>();
    {
        listOfCars.add(new Car("Mercedes", "GLA", 230));
        listOfCars.add(new Car("BMW", "M", 5));
        listOfCars.add(new Car("Toyota", "Land-Cruiser", 500));
        listOfCars.add(new Car("Tesla", "Model-X", 15));
        listOfCars.add(new Car("Lexus", "LX-570", 600));
    }
    @Override
    public List<Car> getByCount(int count) {
        return listOfCars.stream().limit(count).toList();
    }
}
