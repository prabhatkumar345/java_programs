// weather the entered number can be expressed as sum of two prime numbers.  
import java.util.Scanner;

public class prime_number{

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean found = false;

        // Check for all pairs
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }

        sc.close();
    }
}
