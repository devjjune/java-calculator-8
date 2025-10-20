package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    public static String readInput() {
        String input = Console.readLine();

        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력이 비어 있습니다.");
        }

        return input;
    }
}