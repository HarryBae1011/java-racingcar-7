package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.MoveStop;
import racingcar.io.CarInput;
import racingcar.io.CarOutput;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CarInput input = new CarInput();
        CarOutput output = new CarOutput();

        output.printAskingCarNames();
        Cars cars = input.inputCars();
        output.printAskingTrial();
        MoveStop moveStop = input.inputTrials(cars);
        output.printResult(moveStop);
    }
}
