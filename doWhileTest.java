package Day3;

public class doWhileTest {
    public static void main(String[] args) {
        int sum = 0, upperbound = 100;
        int num = 1;
        do {
            sum += num;
            ++num;
        }while (num <= upperbound);
        System.out.println("Sum is: " + sum);

        int n= 5;
        int factorial = 1;
        int number = 1;
        do {
            factorial *= number;
            ++number;
        }while (number <= n);
        System.out.println("Factorial is: " + factorial);
    }
}
