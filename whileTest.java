package Day3;

public class whileTest {
    public static void main(String[] args) {
        int sum = 0, upperbound = 100;
        int num = 1;
        while (num < upperbound){
            sum += num;
            ++num;
        }
        System.out.println("Sum is: " + sum);

        int n = 5;
        int factorial = 1;
        int number = 1;
        while (number <= n){
            factorial *= number;
            ++number;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
