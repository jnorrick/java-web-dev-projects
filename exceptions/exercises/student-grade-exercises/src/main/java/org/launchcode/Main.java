package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int x = 5;
        int y = 0;

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static int Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x/y;
    }

//    public static int CheckFileExtension(String fileName) {
//        return 0; //fix so it stops breaking :D
//    }

}