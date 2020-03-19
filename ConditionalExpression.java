package Day3;

public class ConditionalExpression {
    public static void main(String[] args) {
        int num1 = 9, num2 = 8, max;
        max = (num1 > num2) ? num1 : num2;
        System.out.println("Max = " + max);

        int value = -9, absValue;
        absValue = (value > 0) ? value : -value;
        System.out.println("absValue = " + absValue);

        int mark = 48;
        System.out.println((mark >= 50) ? "PASS" : "FAIL");
    }
}
