
import java.util.Arrays;
import java.util.List;

public class Vowels {
    public boolean isVowels(String testLetter) {
        return testLetter.matches("[aeiou]+");
    }

    public boolean isMoreThan30(String testLetter) {
        return countLength(testLetter) > testLetter.length() * 0.3;
    }

    public long countLength(String testLetter) {
        String[] chars = testLetter.split("");
        List<String> characters = Arrays.asList(chars);
        return characters.stream().filter(this::isVowels).count();
    }
}
