package Day3;

public class Average1To100 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        for (int num = 1; num <= 100; ++num){
            sum += num;
        }
        average = sum/100;
        System.out.println("Average is " + average);
    }
}
