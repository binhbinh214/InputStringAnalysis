package model;

import java.util.*;
import java.util.regex.*;

public class AnalysisMethods {
    // GET NUMBER
    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> result = new HashMap<>();
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> squareNumbers = new ArrayList<>();

        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher matcher = numberPattern.matcher(input);

        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            allNumbers.add(number);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
            if (isPerfectSquare(number)) {
                squareNumbers.add(number);
            }
        }
        result.put("All Numbers", allNumbers);
        result.put("Even Numbers", evenNumbers);
        result.put("Odd Numbers", oddNumbers);
        result.put("Perfect Square Numbers", squareNumbers);
        return result;
    }

    private boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    // GET CHARACTER
    public HashMap<String, StringBuilder> getCharacter(String input) {
        HashMap<String, StringBuilder> result = new HashMap<>();
        StringBuilder allCharacters = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();
        StringBuilder uppercaseCharacters = new StringBuilder();
        StringBuilder lowercaseCharacters = new StringBuilder();

        for (char c : input.toCharArray()) {
            allCharacters.append(c);
            if (Character.isUpperCase(c)) {
                uppercaseCharacters.append(c);
            } else if (Character.isLowerCase(c)) {
                lowercaseCharacters.append(c);
            } else if (Character.isDigit(c)) {
                // Skip, do nothing
            } else {
                specialCharacters.append(c);
            }
        }

        result.put("All Characters", allCharacters);
        result.put("Special Characters", specialCharacters);
        result.put("Uppercase Characters", uppercaseCharacters);
        result.put("Lowercase Characters", lowercaseCharacters);

        return result;
    }

}