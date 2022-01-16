public class CarsAssemble {
    private static final int NUMBER_IN_HOURS = 221;

    public double speeds (int speed) {
        if (speed == 10)
            return 0.77;
        else if (speed == 9)
            return 0.80;
        else if (speed >= 5)
            return 0.90;
        else if (speed < 5)
            return 1.0;
        else
            return speed;
    }

    public double productionRatePerHour(int speed) {
        return NUMBER_IN_HOURS * speed * speeds(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour (speed) / 60;
    }
}
