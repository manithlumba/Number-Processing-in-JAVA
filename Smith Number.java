import java.util.Scanner;

public class SmithNumber {
    private static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitSum = sumDigits(num);
        int primeSum = 0;
        int temp = num;
        int i = 2;

        while (i <= temp) {
            if (temp % i == 0) {
                primeSum += sumDigits(i);
                temp /= i;
            } else {
                i++;
            }
        }

        if (digitSum == primeSum) {
            System.out.println(num + " is a Smith Number.");
        } else {
            System.out.println(num + " is NOT a Smith Number.");
        }
    }
}