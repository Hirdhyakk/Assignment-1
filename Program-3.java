import java.util.Scanner;

public class OddSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        sc.close();
        if (a <= 0) {
            System.out.println("No output for non-positive input.");
            return;
        }

        int count = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i <= count; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < count)
                System.out.print(", ");
        }

    }

}
