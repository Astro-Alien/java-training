
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {

    private final Map<String, BiFunction<Integer, Integer, Integer>> ACTION_MAP = Map.of(
        "add", this::addition,
        "sub", this::subtraction,
        "mul", this::multiplication,
        "div", this::division
    );

    private static final Map<String, String> ACTION_LIST = Map.of(
        "sub", "Subtraction",
        "add", "Addition",
        "mul", "Multiplication",
        "div", "Division"
    );

    public int calculate(String action) {
        
        if (ACTION_LIST.containsKey(action) == false) {
            throw new IllegalArgumentException(
                "Unknown action was passed in: " + action
            );
        }

        IO.println("Performing action: %s".formatted(ACTION_LIST.get(action)));
       
        int numberOne = Integer.parseInt(IO.readln("Please enter your first value: "));
        int numberTwo = Integer.parseInt(IO.readln("Please enter your second value: "));

        var actionMethod = ACTION_MAP.get(action);

        return actionMethod.apply(numberOne, numberTwo);
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(
                "Cannot divide by zero."
            );
        };
        return a / b;
    }
}
