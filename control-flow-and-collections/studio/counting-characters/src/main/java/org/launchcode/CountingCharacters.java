package org.launchcode;


import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>() {
            String myString = "Hello World";
            char[] chVar = myString.toLowerCase().toCharArray();

            for (char c : chVar) {
                if (characterCount.containsKey(c)) {
                    characterCount.put(c, characterCount.get(c) + 1);
                } else {
                    characterCount.put(c, 1);
                }
            }
        };
    }
}


//for (Map.Entry<Character, Integer> c : characterCount.EntrySet()) {
//    Sout(c.getKey()+ ": " c.getValue())
//        }