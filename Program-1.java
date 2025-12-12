public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter value for a: ");

        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");

        double b = sc.nextDouble();

        System.out.print("Enter operation (+  -  *  /): ");

        String operation = sc.next();

        try {

            double result = calc.calculate(a, b, operation);

            System.out.println("Result: " + result);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

    }

}
