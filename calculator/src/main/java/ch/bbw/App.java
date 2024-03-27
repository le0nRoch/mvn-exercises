package ch.bbw;

public class App {

    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println("Sum: " + calculator.sum(5, 3));
        System.out.println("Sub: " + calculator.sub(5, 3));
        System.out.println("Mul: " + calculator.mul(5, 3));
        System.out.println("Div: " + calculator.div(5, 3));
        System.out.println("Square: " + calculator.square(5));
        System.out.println("Power: " + calculator.power(5, 3));
        System.out.println("Factorial: " + calculator.factorial(5));
        System.out.println("Modulo: " + calculator.modulo(5, 3));
        System.out.println("Inverse: " + calculator.inverse(5));
        System.out.println("Negate: " + calculator.negate(5));
        System.out.println("Round: " + calculator.round(5));
    }
}
