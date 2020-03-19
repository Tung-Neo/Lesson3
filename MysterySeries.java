package Day3;

public class MysterySeries {
    public static void main(String[] args) {
        int num = 1;
        while (true){
            ++num;
            if ((num % 3) == 0) continue;
            if (num == 133) break;
            if ((num % 2) == 0){
                num += 3;
            }else {
                num -= 3;
            }
            System.out.print(num + " ");
        }
    }
}
