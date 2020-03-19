package Day3;

public class PrimeList {
    public static void main(String[] args) {
        int upperbound = 100;
        for (int num = 2; num <= upperbound; ++num){
            int maxFactor = (int)Math.sqrt(num);
            boolean isPrime = true;
            int factor = 2;
            while (isPrime && factor <= maxFactor){
                if (num % factor == 0){
                    isPrime = false;
                }
                ++factor;
            }
            if (isPrime) System.out.println(num + " is a prime");
        }
    }
}
