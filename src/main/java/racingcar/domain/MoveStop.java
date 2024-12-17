package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MoveStop {

    private int trial;
    private final Cars cars;
    private int max = 0;
    List<String> winner = new ArrayList<>();

    public MoveStop(Cars input, int trial) {
        this.cars = input;
        this.trial = trial;
    }

    private void attempt() {
        for (Car c : cars.carList) {
            int i = Randoms.pickNumberInRange(0, 9);

            if (i >= 4) {
                c.move();
            }

            System.out.print(c.name + " : ");
            c.printDistance();
            System.out.println();
        }
        System.out.println();
    }

    public void progress() {
        while(trial > 0) {
            attempt();
            trial--;
        }
    }

    private int calculateMax() {
        for (Car c : cars.carList) {
            if (c.getDistance() > max) {
                max = c.getDistance();
            }
        }
        return max;
    }

    public void calculateWinner() {
        int m = calculateMax();
        for (Car c : cars.carList) {
            if (c.getDistance() == m) {
                winner.add(c.name);
            }
        }
    }

    public void printWinners() {
        ListIterator<String> w = winner.listIterator();
        int size = winner.size();
        while (size > 0) {
            if (size == 1) {
                System.out.print(w.next());
            } else {
                System.out.print(w.next() + ", ");
            }
            size--;
        }
    }
}
