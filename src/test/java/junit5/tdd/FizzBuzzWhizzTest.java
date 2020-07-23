package junit5.tdd;

import javafx.scene.media.AudioClip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzWhizzTest {
    @Test
    void should_return_1_when_play_fizzbuzzwhizz_given_1() {
        //given
        int number = 1;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_play_fizzbuzzwhizz_given_3() {
        //given
        int number = 3;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_play_fizzbuzzwhizz_given_5() {
        //given
        int number = 5;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_whizz_when_play_fizzbuzzwhizz_given_7() {
        //given
        int number = 7;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_fizzbuzz_when_play_fizzbuzzwhizz_given_15() {
        //given
        int number = 15;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_fizzwhizz_when_play_fizzbuzzwhizz_given_21() {
        //given
        int number = 21;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_buzzwhizz_when_play_fizzbuzzwhizz_given_35() {
        //given
        int number = 35;
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        //when
        String actual = fizzBuzzWhizz.play(number);

        //then
        assertEquals("BuzzWhizz", actual);
    }
}
