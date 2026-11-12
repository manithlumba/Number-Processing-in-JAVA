import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int len = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            len--;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Disarium Number.");
        } else {
            System.out.println(num + " is NOT a Disarium Number.");
        }
    }
}