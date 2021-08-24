public class main {
    public static void main(String[] args) {
        dates_class dates1 = new dates_class();
        dates_class dates2 = new dates_class();
        boolean a = dates1.is_same(dates2);
        // String text = dates.toString();
        System.out.println(dates1.get_full_date());

    }

}



public class dates_class {
    private int date;
    private int month;
    private int year;
    public static final String[] MONHTS = {"jan", "feb",
    "mar", "apr", "may", "jun", "jul", "aug",
    "sep", "oct", "nov", "dec"};

    public dates_class() {
        java.time.LocalDate today = java.time.LocalDate.now();
        date = today.getDayOfMonth();
        month = today.getMonthValue();
        year = today.getYear();
    }
    public dates_class(int new_day, int new_month, int new_year) {
        date = new_day;
        month = new_month;
        year = new_year;
    }
    public dates_class(String date_string) {
        try {
            String[] values = date_string.split("\\.");
            date = Integer.parseInt(values[0]);
            month = Integer.parseInt(values[1]);
            year = Integer.parseInt(values[2]);
        }
        catch (Exception error) {
            System.out.println("Datetime error, date set to 0.0.0");
            date = 0;
            month = 0;
            year = 0;
        }
    }

    public String get_full_date() {
        return (this.date + "." + MONHTS[this.month-1] + "." + this.year);
    }

    public boolean is_same(dates_class test_date) {
        if ((this.date != test_date.date) || (this.month != test_date.month) || (this.year != test_date.year)) {
            return false;
        }
        return true;
    }

    public void set_date(int new_date) {
        date = new_date;
    }
    public void set_month(int new_month) {
        month = new_month;
    }
    public void set_year(int new_year) {
        year = new_year;
    }
    public int get_day() {
        return date;
    }
    public int get_year() {
        return year;
    }
    public int get_month() {
        return month;
    }
    public String toString() {
        String text = (date + "." + month + "." + year);
        return text;
    }
}