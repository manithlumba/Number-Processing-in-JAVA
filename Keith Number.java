import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String s = String.valueOf(num);
        int len = s.length();
        int[] arr = new int[100];

        for (int i = 0; i < len; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }

        int next = 0, i = len;
        while (next < num) {
            next = 0;
            for (int j = i - len; j < i; j++) {
                next += arr[j];
            }
            arr[i] = next;
            i++;
            if (next == num) break;
        }

        if (next == num) {
            System.out.println(num + " is a Keith Number.");
        } else {
            System.out.println(num + " is NOT a Keith Number.");
        }
    }
}