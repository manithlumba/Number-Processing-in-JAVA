import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String s = sc.next();

        boolean isDuck = false;
        if (s.charAt(0) != '0' && s.contains("0")) {
            isDuck = true;
        }

        if (isDuck) {
            System.out.println(s + " is a Duck Number.");
        } else {
            System.out.println(s + " is NOT a Duck Number.");
        }
    }
}