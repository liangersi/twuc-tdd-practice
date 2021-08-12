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

    @Test
    void should_return_right_length_when_given_a_string(){
        Vowels vowels = new Vowels();
        String testLetter = "aeihjkljutrrvbnxzawi";
        Assertions.assertEquals(6, vowels.countLength(testLetter));
    }

    @Test
    void should_return_true_if_vowels_letter_is_more_than_30_percent(){
        Vowels vowels = new Vowels();
        String testLetter = "aaaaaaaaaaarr";
        Assertions.assertTrue(vowels.isMoreThan30(testLetter));
    }

    @Test
    void should_return_false_if_vowels_letter_is_less_than_30_percent(){
        Vowels vowels = new Vowels();
        String testLetter = "arrrrrrr";
        Assertions.assertFalse(vowels.isMoreThan30(testLetter));
    }

    @Test
    void should_replace_vowels_if_vowels_rate_is_more_than_30_percent(){
        Vowels vowels = new Vowels();
        String testLetter = "aaaaaaaaaaarr";
        Assertions.assertEquals("mommyrr", vowels.replaceAll(testLetter));
    }

}
