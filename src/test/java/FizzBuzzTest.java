import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void of_1_is_none() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void of_3_is_Fizz() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    public void of_5_is_Buzz() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    public void of_6_is_Fizz() {
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void of_10_is_Buzz() {
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void of_15_is_FizzBuzz() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void of_30_is_FizzBuzz() {
        assertThat(FizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

    @Test
    public void of_acceptanceTest() {
        assertThat(FizzBuzz.of(45)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(60)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(47)).isEqualTo("47");
        assertThat(FizzBuzz.of(97)).isEqualTo("97");
        assertThat(FizzBuzz.of(18)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(25)).isEqualTo("Buzz");
    }
}
