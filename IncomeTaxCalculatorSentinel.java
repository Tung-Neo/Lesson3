package Day3;
import java.util.Scanner;
public class IncomeTaxCalculatorSentinel {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        final int SENTINEL = -1;

        int taxableIncome;
        double taxPayable;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();

        while (taxableIncome != SENTINEL){
            if (taxableIncome > 60000){
                taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K +  (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
            }else if (taxableIncome > 40000){
                taxPayable = 20000 * TAX_RATE_ABOVE_20K + (taxableIncome - 40000);
            }else if (taxableIncome > 20000){
                taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
            }else {
                taxPayable = 0;
            }

            System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
            System.out.print("Enter the taxable income: $");
            taxableIncome = in.nextInt();
        }
        System.out.println("Bye!");
        in.close();
    }
}
