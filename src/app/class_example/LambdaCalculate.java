package app.class_example;

public class LambdaCalculate {
    public int calculate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
