import java.util.Scanner;

public class CircularPrime {
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        boolean isCircular = true;
        int temp = num;

        for (int i = 0; i < s.length(); i++) {
            if (!isPrime(temp)) {
                isCircular = false;
                break;
            }
            temp = Integer.parseInt(s.substring(1) + s.charAt(0));
            s = String.valueOf(temp);
        }

        if (isCircular) {
            System.out.println(num + " is a Circular Prime.");
        } else {
            System.out.println(num + " is NOT a Circular Prime.");
        }
    }
}