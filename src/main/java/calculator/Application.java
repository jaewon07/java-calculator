package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static void main(String[] args) {

        Application app = new Application();

        CusTomDelimiterParser customdelimiterParser = new CusTomDelimiterParser();

        System.out.println("덧셈할 문자열을 입력해 주세요.");

        String inputString = Console.readLine();  // 사용자로부터 입력

            // 사용자 정의 구분자 추출
            String customDelimiter = customdelimiterParser.delimiter(inputString);



    }
}
