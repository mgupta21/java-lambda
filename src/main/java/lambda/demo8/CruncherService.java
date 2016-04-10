package lambda.demo8;

/**
 * Created by Mayank on 4/10/2016.
 */
public class CruncherService {

    public int crunch(int i, int j, Cruncher cruncher) {
        return cruncher.crunch(i, j);
    }

    public int add(int i, int j) {
        Cruncher cruncherAddLambda = (a, b) -> a + b;
        return cruncherAddLambda.crunch(i, j);
    }

    public int subtract(int i, int j) {
        Cruncher cruncherSubtractLambda = (a, b) -> a - b;
        return cruncherSubtractLambda.crunch(i, j);
    }

    public int multiply(int i, int j) {
        Cruncher cruncherSubtractLambda = (a, b) -> a * b;
        return cruncherSubtractLambda.crunch(i, j);
    }

    public int divide(int i, int j) {
        Cruncher cruncherSubtractLambda = (a, b) -> a / b;
        return cruncherSubtractLambda.crunch(i, j);
    }

}
