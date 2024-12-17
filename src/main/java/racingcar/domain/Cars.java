package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    List<Car> carList = new ArrayList<>();

    public Cars(String input) {
        String[] original = input.split(",");
        putCar(original);
    }

    private void putCar(String[] original) {
        Arrays.stream(original)
                .map(Car::new)
                .forEach(car -> carList.add(car));
    }
}
