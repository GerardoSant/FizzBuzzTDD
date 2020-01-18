public class FizzBuzz {

    public static String of(int number) {
        return (isDivisibleByThree(number) && isDivisibleByFive(number)) ? "FizzBuzz" : isDivisibleByThree(number) ? "Fizz" : isDivisibleByFive(number) ? "Buzz" : intToString(number);
    }

    private static String intToString(int number) {
        return String.valueOf(number);
    }

    private static boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    private static boolean isDivisibleByThree(int i) {
        return i%3==0;
    }
}
