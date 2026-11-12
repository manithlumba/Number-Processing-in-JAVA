import java.util.Scanner;

public class GoldbachNumber {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number: ");
        int num = sc.nextInt();

        if (num <= 2 || num % 2 != 0) {
            System.out.println("Invalid input. Enter an even number greater than 2.");
            return;
        }

        System.out.println("Prime pairs are:");
        for (int i = 3; i <= num / 2; i += 2) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(i + " + " + (num - i) + " = " + num);
            }
        }
    }
}