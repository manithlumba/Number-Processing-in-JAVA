import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 100) {
            System.out.println("Not a fascinating number.");
            return;
        }

        String concat = num + "" + (num * 2) + "" + (num * 3);
        boolean isFascinating = true;

        for (char c = '1'; c <= '9'; c++) {
            int count = 0;
            for (int i = 0; i < concat.length(); i++) {
                if (concat.charAt(i) == c) {
                    count++;
                }
            }
            if (count != 1) {
                isFascinating = false;
                break;
            }
        }

        if (isFascinating) {
            System.out.println(num + " is a Fascinating Number.");
        } else {
            System.out.println(num + " is NOT a Fascinating Number.");
        }
    }
}