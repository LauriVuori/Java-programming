public class IntegerParseIntExample1 {  
    public static void main(String[] args) {
        String date = "13.08.2016";
        String[] values = date.split("\\.");
        int day = Integer.parseInt(values[0]);
        int month = Integer.parseInt(values[1]);
        int year = Integer.parseInt(values[2]);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }  
}  