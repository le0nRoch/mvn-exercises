package ch.bbw;

public class Calculator<T extends Number> {
    public double sum(T summand1, T summand2) {
        return summand1.doubleValue() + summand2.doubleValue();
    }

    public double sub(T minuend, T subtrahend) {
        return minuend.doubleValue() - subtrahend.doubleValue();
    }

    public double mul(T factor1, T factor2) {
        return factor1.doubleValue() * factor2.doubleValue();
    }

    public double div(T dividend, T divisor) {
        if (divisor.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return dividend.doubleValue() / divisor.doubleValue();
    }

    public double square(T number) {
        return Math.sqrt(number.doubleValue());
    }

    public double power(T base, T exponent) {
        return Math.pow(base.doubleValue(), exponent.doubleValue());
    }

    public double factorial(T number) {
        if (number.doubleValue() < 0) {
            throw new ArithmeticException("Factorial of negative number!");
        }
        double result = 1;
        for (int i = 1; i <= number.doubleValue(); i++) {
            result *= i;
        }
        return result;
    }

    public double modulo(T dividend, T divisor) {
        if (divisor.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return dividend.doubleValue() % divisor.doubleValue();
    }

    public double inverse(T number) {
        if (number.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return 1 / number.doubleValue();
    }

    public double negate(T number) {
        return -number.doubleValue();
    }

    public double round(T number) {
        return Math.round(number.doubleValue());
    }

    public double ceil(T number) {
        return Math.ceil(number.doubleValue());
    }

    public double floor(T number) {
        return Math.floor(number.doubleValue());
    }

    public double abs(T number) {
        return Math.abs(number.doubleValue());
    }

    public double max(T number1, T number2) {
        return Math.max(number1.doubleValue(), number2.doubleValue());
    }

    public double min(T number1, T number2) {
        return Math.min(number1.doubleValue(), number2.doubleValue());
    }
}
