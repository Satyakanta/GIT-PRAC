import java.util.*;

public class Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, z, count = 0, sum = 0, digit;
        System.out.print("Enter value = ");
        n = sc.nextInt();

        z = n;

        // count digits
        while (z > 0) {
            count++;
            z = z / 10;
        }

        z = n;

        // Armstrong calculation
        while (z > 0) {
            digit = z % 10;
            int pro = 1; // RESET here

            for (int i = 1; i <= count; i++) {
                pro = pro * digit;
            }

            sum = sum + pro;
            z = z / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
