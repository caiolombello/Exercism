import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        if (birdsPerDay.length == 0)
            return 0;
        else
            return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdsInDay : birdsPerDay) {
            if (birdsInDay == 0)
                return true;
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        int count = 0;
        for (int birdsInDay : birdsPerDay) {
            if (birdsInDay >= 5) {
                count++;
            }
        }
        return count;
    }
}
