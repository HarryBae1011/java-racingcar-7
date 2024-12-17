package racingcar.domain;

public class Car {

    private final int MAX_LENGTH = 5;
    private int distance = 0;
    public final String name;

    public Car(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
    }

    public void move() {
        distance++;
    }

    public void printDistance() {
        int temp = distance;
        while (temp > 0) {
            System.out.print("-");
            temp--;
        }
    }

    public int getDistance() {
        return distance;
    }

}
