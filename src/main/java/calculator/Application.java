package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String[] numWords;
        int summed = 0;
        String input = InputHandler.readInput();

        numWords = InputParser.parse(input);
        summed = StringAddCalculator.calculateSum(numWords);

        System.out.println("결과 : " + summed);
    }
}