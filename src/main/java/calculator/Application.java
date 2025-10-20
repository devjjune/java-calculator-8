package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        String[] numWords;
        int summed = 0;
        String input = InputHandler.readInput();

        try {
            numWords = InputParser.parse(input);
            summed = StringAddCalculator.sumNumber(numWords);

            System.out.println("결과 : " + summed);

        } catch (IllegalArgumentException e) {

            System.out.println("입력 오류: " + e.getMessage());

        }

    }

}