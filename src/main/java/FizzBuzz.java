public class FizzBuzz {

    public static String of(int number) {
        String result =
            (isDivisibleByThree(number) ? "Fizz" : "") +
            (isDivisibleByFive(number) ? "Buzz" : "");
        return result.isEmpty() ? intToString(number) : result;
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
