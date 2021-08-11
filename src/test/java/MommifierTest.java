import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    @Test
    void should_return_if_given_is_vowels(){
        Vowels vowels = new Vowels();
        String testLetter = "a";
        Assertions.assertTrue(vowels.isVowels(testLetter));
    }
}
