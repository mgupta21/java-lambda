package lambda.demo8;

/**
 * Created by Mayank on 4/10/2016.
 */
public class Demo8 {

    private static CruncherService service = new CruncherService();

    public static void main(String[] args) {

        int x = 15;
        int y = 3;

        System.out.println("\nAddition: ");
        System.out.println(service.crunch(x, y, (a, b) -> a + b));
        System.out.println(service.add(x, y));

        System.out.println("\nSubtraction: ");
        System.out.println(service.crunch(x, y, (a, b) -> a - b));
        System.out.println(service.subtract(x, y));

        System.out.println("\nMultiplication: ");
        System.out.println(service.crunch(x, y, (a, b) -> a * b));
        System.out.println(service.multiply(x, y));

        System.out.println("\nDivision: ");
        System.out.println(service.crunch(x, y, (a, b) -> a / b));
        System.out.println(service.divide(x, y));


    }
}
