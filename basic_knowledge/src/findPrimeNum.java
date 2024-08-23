
import java.util.ArrayList;

public class findPrimeNum {

    public static void main(String[] args) {
        int[] primeNum = findPrime(100);
        for (int element : primeNum) {
            System.out.print(element + " ");
        }
        System.out.println();

        int a = 10;
        int b = 5;
        System.out.println(isPrime(a));
        System.out.println(isPrime(b));

    }

    public static int[] findPrime(int max) {
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) {
                primeNum.add(i);
            }
        }
        int[] primeNumArr = primeNum.stream().mapToInt(i -> i).toArray();
        return primeNumArr;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
