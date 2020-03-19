package Day3;

public class Gregorian {
    public static void main(String[] args) {
        int year = 1582;
        int month = 12;
        int day = 31;

        System.out.println((year < 1582) || (year == 1582 && month < 10) || (year == 1582 && month == 10 && day < 15));
    }
}
