package homework;

public class StringOperation {
    public boolean isStringContainsUpperCase(String string) {
        boolean upper = false;
        char currentCharacter;
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            currentCharacter = string.charAt(i);
            if (Character.isUpperCase(currentCharacter)) {
                upper = true;
            }
        }
        return upper;
    }

    public boolean isStringContainsNumbers(String string) {
        boolean number = false;
        char currentCharacter;
        int stringLength = string.length();
        for (int i = 0; i < stringLength; i++) {
            currentCharacter = string.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                number = true;
            }
        }
        return number;
    }

    public boolean isFirstLetterCapital(String string) {
        char currentCharacter = string.charAt(0);
        return Character.isUpperCase(currentCharacter);
    }

    public boolean isLengthEven(String string) {
        int stringLength = string.length();
        int divisor = 2;
        return stringLength % divisor == 0;
    }

    public boolean isMoreThanThree(String string) {
        String[] words = string.split("\\s+");
        return words.length > 3;
    }
}