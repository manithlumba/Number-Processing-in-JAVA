import java.util.Scanner;

public class PrimeAdam {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (!isPrime(num)) {
            System.out.println("Not a Prime Adam number.");
            return;
        }

        int sq1 = num * num;
        int revNum = reverse(num);
        int sq2 = revNum * revNum;

        if (sq1 == reverse(sq2)) {
            System.out.println(num + " is a Prime Adam Number.");
        } else {
            System.out.println(num + " is NOT a Prime Adam Number.");
        }
    }
}