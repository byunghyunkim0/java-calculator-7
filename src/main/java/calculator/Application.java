package calculator;

import calculator.controller.CalculatorController;
import calculator.util.InputUtils;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CalculatorController controller = new CalculatorController();
        controller.run();
    }
}
