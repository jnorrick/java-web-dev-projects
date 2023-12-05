package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterClassBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to count its characters: ");
        String userString = input.nextLine();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] charArray = userString.toLowerCase().toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char letter : charArray) {
            if (alphabet.indexOf(letter) >= 0) {
                if (characterCount.containsKey(letter)) {
                    characterCount.put(letter, characterCount.get(letter) + 1);
                } else {
                    characterCount.put(letter, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> count : characterCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}

