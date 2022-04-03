package challanges;

public class DurationString {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            seconds += minutes * 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            int hours = seconds / 3600;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = remainingSeconds + "s ";
            if (remainingSeconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesString + secondsString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
