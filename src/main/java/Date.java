// Exercise 4, Question2
public class Date {
    private int day;
    private int month;
    private int year;

    public Date (int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", day=" + day +
                ", month=" + month +
                '}';
    }
}
