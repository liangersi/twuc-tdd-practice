import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    @Test
    void should_return_if_given_is_vowels(){
        Vowels vowels = new Vowels();
        String testLetter = "a";
        Assertions.assertTrue(vowels.isVowels(testLetter));
    }

    @Test
    void should_return_if_given_are_vowels(){
        Vowels vowels = new Vowels();
        String testLetter = "aei";
        Assertions.assertTrue(vowels.isVowels(testLetter));
    }

    @Test
    void should_return_if_vowels_count_more_than_30(){
        Vowels vowels = new Vowels();
        String testLetter = "aeihj";
        Assertions.assertTrue(vowels.isMoreThan30(testLetter));
    }
}
