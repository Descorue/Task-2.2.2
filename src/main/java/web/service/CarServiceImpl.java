package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final Dao dao;

    @Autowired
    public CarServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getCarsAmount(int count) {
        return dao.getCarsAmount(count);
    }
}
