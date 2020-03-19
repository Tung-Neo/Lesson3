package Day3;

public class NonPrimeList {
    public static void main(String[] args) {
        int upperbound = 100;
        for (int num = 2; num <= upperbound; ++num){
            int maxFactor = (int)Math.sqrt(num);
            for (int factor = 2; factor <= maxFactor; ++factor){
                if (num % factor == 0){
                    System.out.println(num + " is NOT a prime");
                    break;
                }
            }
        }
    }
}
