package school.mjc.stage0.conditions.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        ArrayList<Integer> vowels = new ArrayList<>(Arrays.asList(97, 101, 105, 111, 117, 65, 69, 73, 79, 85));
    if((character >= 97 && character <= 122) || (character >= 65 && character <= 90) ) {
        if (vowels.contains((int) character)) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
    else
        System.out.println("wrong alphabet!");

    }
}
//aeiou  97, 101, 105, 111, 117, 65, 69, 73, 79, 85