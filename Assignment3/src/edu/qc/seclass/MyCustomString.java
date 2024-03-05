package edu.qc.seclass;

public class MyCustomString implements MyCustomStringInterface {

    private String currentString = null;

    @Override
    public String getString() {
        return currentString;
    }

    @Override
    public void setString(String string) {
        currentString = string;
    }

    @Override
    public int countNumbers() {
        if (currentString == null) {
            throw new IllegalArgumentException("The current string is null.");
        }
        int count = 0;
        boolean isPrevDigit = false;
        for (int i = 0; i < currentString.length(); i++) {
            if (Character.isDigit(currentString.charAt(i))) {
                if (!isPrevDigit) {
                    count++;
                    isPrevDigit = true;
                }
            } else {
                isPrevDigit = false;
            }
        }
        return count;
    }

    @Override
    public String getEveryNthCharacterFromBeginningOrEnd(int n, boolean startFromEnd) {
        if (currentString == null) {
            throw new NullPointerException("The current string is null.");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0.");
        }
        if (currentString.isEmpty() || currentString.length() < n) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        if (!startFromEnd) {
            for (int i = n - 1; i < currentString.length(); i += n) {
                result.append(currentString.charAt(i));
            }
        } else {
            for (int i = currentString.length() - n; i >= 0; i -= n) {
                result.insert(0, currentString.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public void convertDigitsToNamesInSubstring(int startPosition, int endPosition) {
        if (currentString == null) {
            throw new IllegalArgumentException("The current string is null.");
        }
        if (startPosition > endPosition) {
            throw new IllegalArgumentException("startPosition cannot be greater than endPosition.");
        }
        if (startPosition < 1 || endPosition > currentString.length()) {
            throw new IllegalArgumentException("startPosition or endPosition are out of bounds.");
        }
        StringBuilder sb = new StringBuilder(currentString);
        for (int i = endPosition - 1; i >= startPosition - 1; i--) {
            char c = sb.charAt(i);
            if (Character.isDigit(c)) {
                sb.replace(i, i + 1, digitToWord(c));
            }
        }
        currentString = sb.toString();
    }

    private String digitToWord(char digit) {
        switch (digit) {
            case '0': return "Zero";
            case '1': return "One";
            case '2': return "Two";
            case '3': return "Three";
            case '4': return "Four";
            case '5': return "Five";
            case '6': return "Six";
            case '7': return "Seven";
            case '8': return "Eight";
            case '9': return "Nine";
            default: return Character.toString(digit);
        }
    }
}
