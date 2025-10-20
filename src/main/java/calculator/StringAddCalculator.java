package calculator;

public class StringAddCalculator {
    public static int calculateSum(String arr[]) {
        int sum = 0;

        Validator.validate(arr);

        for (int j = 0; j < arr.length; j++) {
            sum += Integer.parseInt(arr[j]);
        }
        return sum;
    }
}
