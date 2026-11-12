import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        while (temp != 1 && temp != 4) {
            int sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += d * d;
                temp /= 10;
            }
            temp = sum;
        }

        if (temp == 1) {
            System.out.println(num + " is a Happy Number.");
        } else {
            System.out.println(num + " is NOT a Happy Number.");
        }
    }
}