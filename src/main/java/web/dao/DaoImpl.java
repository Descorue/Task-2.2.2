package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DaoImpl implements Dao {
    private List<Car> creatList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "Black", 1111));
        carList.add(new Car("Kia", "Yellow", 2222));
        carList.add(new Car("Skoda", "White", 3333));
        carList.add(new Car("Lada", "Green", 4444));
        carList.add(new Car("Dodge", "Red", 5555));
        return carList;
    }

    @Override
    public List<Car> getCarsAmount(int count) {
        return creatList().stream().limit(count).toList();
    }
}

