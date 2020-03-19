package Day3;

public class PrimeListWithBreak {
    public static void main(String[] args) {
        int upperbound = 100;
        for (int num = 2; num <= upperbound; ++num){
            int maxFactor = (int)Math.sqrt(num);
            boolean isPrime = true;
            for (int factor = 2; factor <= maxFactor; ++factor){
                if (num % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(num + " is a prime");
        }
    }
}
