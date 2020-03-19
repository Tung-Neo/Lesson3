package Day3;
import java.util.Scanner;
public class Add2integer {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        num1 = in.nextInt();
        System.out.print("Enter second integer: ");
        num2 = in.nextInt();

        sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        in.close();
    }
}
