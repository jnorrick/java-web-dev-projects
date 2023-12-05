package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = myString.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char letter : charArray) {
            if (characterCount.containsKey(letter)) {
                characterCount.put(letter, characterCount.get(letter) + 1);
            } else {
                characterCount.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> count : characterCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
};
