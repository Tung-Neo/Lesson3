package Day3;

public class forTest {
    public static void main(String[] args) {
        int sum = 0, upperbound = 100;
        for (int num = 1; num < upperbound; ++num){
            sum += num;
        }
        System.out.println("Sum is: " + sum);

        int n =5;
        int factorial = 1;
        for (int number = 1; number <= n; ++number){
            factorial *= number;
        }
        System.out.println("Factorial is: " + factorial);
    }
}
