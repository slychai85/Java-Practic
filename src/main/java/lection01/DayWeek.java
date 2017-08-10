package lection01;

public enum DayWeek {
    MONDAY(1), FRIDAY(5), SUNDAY(7);

    private int number;
    private DayWeek(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "DayWeek{" +
                "name=" + name() +
                " number=" + number +
                '}';
    }
}
