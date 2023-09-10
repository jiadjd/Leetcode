package LambdaExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using a lambda expression to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        // Using a lambda expression to map each number to its square
        List<Integer> squares = evenNumbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares);

        // Using a lambda expression to calculate the sum of squares
        int sumOfSquares = squares.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
