package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();

        if (input.startsWith("//")) {
            int a = input.indexOf("//");
            int b = input.indexOf("\n");
            String i = input.substring(a + 2, b);



        } else {



        }
    }


}