package org.launchcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacterSuperBonus {
    public static void main(String[] args) {

        String quoteFromFile = "";

        try {
            System.out.println("HelloWorld!");
            File textFromFile = new File("C:\\Users\\mnemo\\LaunchCode\\java-web-dev-projects\\control-flow-and-collections\\studio\\counting-characters\\src\\main\\java\\org\\launchcode\\quote.txt");

            Scanner myReader = new Scanner(textFromFile);
            System.out.println(myReader);
            if (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
                myReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred when trying to read quote from file.");
        }


        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] charArray = quoteFromFile.toLowerCase().toCharArray();
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
