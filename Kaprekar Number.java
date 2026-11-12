import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long square = num * num;
        String s = String.valueOf(square);
        int len = s.length();
        int mid = len / 2;

        long left = mid == 0 ? 0 : Long.parseLong(s.substring(0, mid));
        long right = Long.parseLong(s.substring(mid));

        if (left + right == num) {
            System.out.println(num + " is a Kaprekar Number.");
        } else {
            System.out.println(num + " is NOT a Kaprekar Number.");
        }
    }
}