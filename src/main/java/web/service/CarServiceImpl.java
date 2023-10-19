package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getByCount(int count) {
        if (count>5) {
            return carDao.getByCount(5);
        } else {
            return carDao.getByCount(count);
        }
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }
}
