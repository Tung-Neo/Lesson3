package Day3;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TextFileScannerWithThrows {
    public static void main(String[] args)
        throws FileNotFoundException{
            int num1;
            double num2;
            String name;
            Scanner in = new Scanner(new File("D:\\Java\\Tung_Neo\\src\\Day3\\in.txt"));
            num1 = in.nextInt();
            num2 = in.nextDouble();
            name = in.next();
            System.out.printf("Hi %s, the sum of %d and %.2f%n", name, num1, num2, num1 + num2);

    }
}
