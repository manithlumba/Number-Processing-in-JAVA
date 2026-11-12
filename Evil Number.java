import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        String bin = "";
        while (temp > 0) {
            bin = (temp % 2) + bin;
            temp /= 2;
        }

        int countOnes = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                countOnes++;
            }
        }

        System.out.println("Binary: " + bin);
        if (countOnes % 2 == 0) {
            System.out.println(num + " is an Evil Number.");
        } else {
            System.out.println(num + " is NOT an Evil Number.");
        }
    }
}