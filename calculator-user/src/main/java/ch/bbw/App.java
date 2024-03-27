package ch.bbw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println("Sum: " + calculator.sum(5, 3));
    }
}
