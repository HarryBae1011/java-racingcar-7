package racingcar.io;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Cars;
import racingcar.domain.MoveStop;

public class CarInput {

    public Cars inputCars() {
        return new Cars(Console.readLine());
    }

    public MoveStop inputTrials(Cars cars) {
        int trial = Integer.parseInt(Console.readLine());
        return new MoveStop(cars, trial);
    }

}
