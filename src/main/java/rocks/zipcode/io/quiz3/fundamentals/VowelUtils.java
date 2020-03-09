package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        for (char elements : word.toCharArray()) {
            if (elements == 'a' ||
                    elements == 'e' ||
                    elements == 'i' ||
                    elements == 'o' ||
                    elements == 'u') {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] wordToChars = word.toCharArray();
        for (int i = 0; i < wordToChars.length; i++) {
            if (wordToChars[i] == 'a' ||
                    wordToChars[i] == 'e' ||
                    wordToChars[i] == 'i' ||
                    wordToChars[i] == 'o' ||
                    wordToChars[i] == 'u' ||
                    wordToChars[i] == 'A' ||
                    wordToChars[i] == 'E' ||
                    wordToChars[i] == 'I' ||
                    wordToChars[i] == 'O' ||
                    wordToChars[i] == 'U'
            ) {
                return i;
            }

        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return getIndexOfFirstVowel(word) == 0;
    }

    public static Boolean isVowel(Character character) {

        return character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u' ||
                character== 'A' ||
                character == 'E' ||
                character == 'I' ||
                character == 'O' ||
                character == 'U';

    }
}
