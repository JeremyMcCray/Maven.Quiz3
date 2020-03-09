package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String ans = "";
        char upper = str.toUpperCase().charAt(indexToCapitalize);
        for (int i = 0; i <indexToCapitalize ; i++) {
            ans+= str.charAt(i);
        }
        ans+=upper;
        for (int i = indexToCapitalize+1; i <str.length() ; i++) {
            ans+= str.charAt(i);
        }
        return ans;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return  (characterToCheckFor == baseString.charAt(indexOfString));

    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){

        return null;
    }
}
