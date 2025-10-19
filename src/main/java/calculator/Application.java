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




}