package calculator;

public class Validator {

    public static void ifError(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num <= 0 ) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }
        }
    }
}
