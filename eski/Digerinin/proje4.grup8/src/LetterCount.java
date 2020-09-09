import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LetterCount {


    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */
    /*
            Girdiğiniz String parametresinin herbir karakterinin(char) sayısını
            döndüren charCount methodunu yazın
            Örnek:
            String = aabbbcccc
            return     a , 2     olmalı
                       b , 3
                       c , 4
            Not: Stringde herhangi bir char olabilir.
     */
    public LinkedHashMap<Character, Integer> charCount(String myStr) {
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < myStr.length(); i++) {

            if (!result.containsKey(myStr.charAt(i))) {
                result.put(myStr.charAt(i), 1);
            } else {
                int count = (int) result.get(myStr.charAt(i));
                result.put(myStr.charAt(i), count + 1);
            }
        }                return result;
    }
}








