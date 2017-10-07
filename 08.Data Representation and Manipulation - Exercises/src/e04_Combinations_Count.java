import java.math.BigInteger;
import java.util.Scanner;

public class e04_Combinations_Count {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int combinationLength = Integer.parseInt(scan.nextLine());

        System.out.println(getCombinationCount(number, combinationLength));
    }

    private static BigInteger getCombinationCount(int number, int combinationLength) {
        BigInteger numberFactorial = getFactorial(new BigInteger(String.valueOf(number)));
        BigInteger lengthFactorial = getFactorial(new BigInteger(String.valueOf(number - combinationLength)))
                .multiply(getFactorial(new BigInteger(String.valueOf(combinationLength))));

        return numberFactorial.divide(lengthFactorial);
    }

    private static BigInteger getFactorial(BigInteger num) {
        if (num.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return num.multiply((getFactorial(num.subtract(BigInteger.ONE))));
    }
}
