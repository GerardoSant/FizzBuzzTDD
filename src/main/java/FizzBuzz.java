public class FizzBuzz {

    /**
     * Calculates FizzBuzz for a given number.
     * https://en.wikipedia.org/wiki/Fizz_buzz
     *
     * @param number        An integer.
     *
     * @return              "Fizz" if the number is multiple of 3,
     *                      "Buzz" if the number is multiple of 5,
     *                      and "FizzBuzz" if it's multiple of 15;
     *                      otherwise, the number as a string.
     */
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
