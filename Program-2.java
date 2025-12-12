public class OddSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");

        int a = sc.nextInt();

        int number = 1;

        System.out.print("Output: ");

        for (int i = 1; i <= a; i++) {

            System.out.print(number);

            number += 2;

            if (i < a) {

                System.out.print(", ");

            }

        }

        sc.close();

    }

}
