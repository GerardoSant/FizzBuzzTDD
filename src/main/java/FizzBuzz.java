public class FizzBuzz {

    public static String of(int number) {
        return (isDivisibleByThree(number) && isDivisibleByFive(number)) ? "FizzBuzz" : isDivisibleByThree(number) ? "Fizz" : isDivisibleByFive(number) ? "Buzz" : intToString(number);
    }

    private static String intToString(int number) {
        return String.valueOf(number);
    }

    private static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
