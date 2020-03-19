package Day3;

public class OddEvenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        int num = lowerbound;
        while (num <= upperbound){
            if (num % 2 == 0){
                sumEven += num;
            }else {
                sumOdd += num;
            }
        }
        num++;

        if (sumOdd > sumEven){
            absDiff = sumOdd - sumEven;
        }else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is: " + sumOdd);
        System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is: " + sumEven);
        System.out.println("The absolute difference between the two sums is: " + absDiff);
    }
}