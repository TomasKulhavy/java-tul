package kulhavy;

public class Time {
    private long hours;
    private long minutes;
    private long seconds;

    public Time(long seconds, long minutes, long hours) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(long secondsInput) {
        hours = secondsInput / 3600;
        minutes = secondsInput / 60 % 60;
        seconds = secondsInput % 60;
    }

    public Time(String time) {
        String[] arr = time.split(":");
        hours = Integer.parseInt(arr[0]);
        minutes = Integer.parseInt(arr[1]);
        seconds = Integer.parseInt(arr[2]);
    }

    public long getHours() { return hours; }

    public long getMinutes() { return minutes; }

    public long getSeconds() { return seconds; }

    public long timeToSeconds()
    {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public String timeToString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public Time difference(Time t2) {
        return new Time(t2.timeToSeconds() - this.timeToSeconds());
    }
}
