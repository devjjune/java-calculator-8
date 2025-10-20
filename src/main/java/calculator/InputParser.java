package calculator;

public class InputParser {

    public static String[] parse(String input) {
        if (input.startsWith("//")) { // 입력이 커스텀 구분자로 시작하는 경우
            int a = input.indexOf("\\n");
            if (a == -1) {
                a = input.indexOf("\n");
            }

            String i = input.substring(2, a);
            String numbers = input.substring(a + 2);

            return numbers.split("[,:]|" + i);
        }

        return input.split("[,:]");
    }
}