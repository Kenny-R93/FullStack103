package DAY56.JavaLambdaExpressions;

import java.util.function.BinaryOperator;

import java.util.function.Predicate;

import java.util.function.Function;

import java.util.function.Consumer;

import java.util.function.Supplier;


public class JavaLambdaExpressionsPractice {

    public static <MyFunctionalInterface> void main(String[] args) {

        // Task 1: Simple Lambda Expressions
        // Create a few simple lambda expressions that perform addition, subtraction, multiplication, and division operations.
        // Test your lambda expressions to make sure they work correctly.

        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(5, 7)); // Output: 12


        BinaryOperator<Integer> subtract = (a, b) -> a - b;

        System.out.println(subtract.apply(5, 7)); // Output: 12


        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        System.out.println(multiply.apply(5, 7)); // Output: 12


        BinaryOperator<Integer> divide = (a, b) -> a / b;

        System.out.println(divide.apply(35, 7)); // Output: 12


        // Task 2: Lambda Expressions with Functional Interfaces
        // Create your own functional interfaces and use lambda expressions to create instances of them.
        Predicate<String> isLong = (str) -> str.length() > 10;
        System.out.println(isLong.test("Is this string is longer than 10?"));


        myGreetingFunction spanishGreeting = (name) -> "Hola, " + name;
        System.out.println(spanishGreeting.sayHello("Kenny"));

        Greeting2 italianGreeting = (name) -> "Ciao, " + name;
        System.out.println(italianGreeting.sayHello("Kenny"));


        // Task 3: Lambda Expressions with Built-in Functional Interfaces
        // Use lambda expressions with Java's built-in functional interfaces such as Predicate, Function, Consumer, and Supplier.

        // Predicate
        Predicate<Integer> isGreaterThan = (number) -> number > 10;
            System.out.println(isGreaterThan.test(13));

        // Function
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String greeting = "Rise Above";
        System.out.println(toUpperCase.apply(greeting));

        // Consumer
        Consumer<String> message = ("Don't Give Up") -> {
            System.out.println("Don't Give Up");
            System.out.println("Don't Give Up");
        };
        message.accept("Reminder to Never Give Up");

        // Supplier
        Supplier<Double> randomNumberGenerator = () -> Math.random();
        double randomNumber = randomNumberGenerator.get();

    }




    // Task 2
    @FunctionalInterface
    public interface myGreetingFunction {
        String sayHello(String name);
    }
    // Task 3
    @FunctionalInterface
    public interface Greeting2 {
        String sayHello(String name);
    }

}