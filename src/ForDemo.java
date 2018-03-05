/**
 * number of prime numbers found between two numbers
 */
public class ForDemo {
    public static void main(String[] args) {
        int rangeMin = 5;
        int rangeMax = 100;
        int countPrime = 0;
        for (int i = 5; i <= 100; i++) {
            boolean yesPrime = isPrime(i);
            if (yesPrime == true) {
                countPrime++;
                System.out.println(i);
            }
        }
        System.out.println("The number of prime numbers between " + rangeMin + " and " + rangeMax + "is " + countPrime);
    }

    public static boolean isPrime(int n) {
        if (n==1)
            return false;
        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
