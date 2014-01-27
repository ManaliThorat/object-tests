/**
 * Created by manalit on 1/27/14.
 */
class Format {
    String dateTimePart;

    Format(int dateTimePart) {
        this.dateTimePart = String.valueOf(dateTimePart);
    }

    public String format() {
        this.dateTimePart = "0" + this.dateTimePart;
        return this.dateTimePart.substring(this.dateTimePart.length() - 2);
    }
}

class Date {
    int day;
    int month;
    int year;

    Date(String date) {
        String[] dateParts = date.split("/");
        this.day = Integer.parseInt(dateParts[0]);
        this.month = Integer.parseInt(dateParts[1]);
        this.year = Integer.parseInt(dateParts[2]);
    }

    @Override
    public String toString() {
        StringBuilder date = new StringBuilder("");
        date.append(new Format(this.day).format()).append("/");
        date.append(new Format(this.month).format()).append("/");
        return date.append(this.year).toString();
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(String time) {
        String[] timeParts = time.split(":");
        this.hours = Integer.parseInt(timeParts[0]);
        this.minutes = Integer.parseInt(timeParts[1]);
        this.seconds = Integer.parseInt(timeParts[2]);
    }

    @Override
    public String toString() {
        StringBuilder time = new StringBuilder("");
        time.append(new Format(this.hours).format()).append(":");
        time.append(new Format(this.minutes).format()).append(":");
        time.append(new Format(this.seconds).format());
        return time.toString();
    }
}

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(String dateTimeFormat) {
        String[] dateTimeParts = dateTimeFormat.split(" ");
        this.date = new Date(dateTimeParts[0]);
        this.time = new Time(dateTimeParts[1]);
    }

    @Override
    public String toString() {
        StringBuilder date = new StringBuilder("");
        date.append(this.date.toString()).append(" ").append(this.time.toString());
        return date.toString();
    }
}