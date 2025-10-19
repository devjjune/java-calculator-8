package calculator;

public class StringAddCalculator {
    public static int sumNumber(String arr[]) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += Integer.parseInt(arr[j]);
        }
        return sum;
    }
}
