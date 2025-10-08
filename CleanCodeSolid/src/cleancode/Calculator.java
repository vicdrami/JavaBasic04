package cleancode;

import java.util.function.BiFunction;

public class Calculator {

    public static float add (float a, float b){
        return a + b;
    }

    public static float subtract (float a, float b){
        return a - b;
    }

    public static float multiply (float a, float b){
        return a * b;
    }

    public static float divide (float a, float b){
        return a / b;
    }
    public static float operate(float a, float b, String operation) {
        switch (operation) {
            case "add":
                return add(a,b);
            case "subtract":
                return subtract(a,b);
            case "multiply":
                return multiply(a,b);
            case "divide":
                return divide(a,b);
            default:
                System.out.println("Error: Invalid operation.");
                return a;
        }
    }

    public static double calc(float number) {

        number = operate(number, 5, "add");
        number = operate(number, 3, "multiply");
        number = operate(number, 2, "subtract");
        number = operate(number, 4, "divide");
        number = operate(number, 10, "add");
        number = operate(number, 2, "multiply");

        BiFunction<Float, Float, Float> custom = (a, b) -> { return a + b * 2F; };

        number = custom.apply(number, 5f);

        number = operate(number, 3, "multiply");
        number = operate(number, 8, "diivide");
        number = operate(number, 2, "ass");

        return number;
    }
}
