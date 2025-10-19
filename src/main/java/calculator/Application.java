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



        } else {
            String[] arr = input.split("[,:]");



        }
    }


}