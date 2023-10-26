package web.dao;

import web.model.Car;

import java.util.List;

public interface Dao {


    List<Car> getCarsAmount(int count);
}
