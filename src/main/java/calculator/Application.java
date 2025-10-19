package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();

        if (input.startsWith("//")) {
            int a = input.indexOf("\n");
            String i = input.substring(2, a);
            String numbers = input.substring(a + 1);

            String[] arr = numbers.split("[,:]|" + i);
            ifError(arr);



        } else {
            String[] arr = input.split("[,:]");
            ifError(arr);



        }
    }

    public static void ifError(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if (num <= 0 ) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }
        }
    }
}