package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {


        if (input.startsWith("//")) {
            int a = input.indexOf("\\n");
            if (a == -1) {
                a = input.indexOf("\n");
            }

            String i = input.substring(2, a);
            String numbers = input.substring(a + 2);

            String[] arr = numbers.split("[,:]|" + i);
            ifError(arr);
            int sum = sumNumber(arr);
            System.out.println("결과 : " + sum);



        } else {
            String[] arr = input.split("[,:]");
            ifError(arr);
            int sum = sumNumber(arr);
            System.out.println("결과 : " + sum);



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

    public static int sumNumber(String arr[]) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += Integer.parseInt(arr[j]);
        }
        return sum;
    }
}