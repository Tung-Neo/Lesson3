package Day3;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TextFileScannerWithCatch {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        try{
            Scanner in = new Scanner(new File("D:\\Java\\Tung_Neo\\src\\Day3\\in.txt"));
            num1 = in.nextInt();
            num2 = in.nextDouble();
            name = in.next();
            System.out.printf("hi %s, the sum of %d and %.2f%n", name , num1, num2, num1 + num2);
            in.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
