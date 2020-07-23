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
}