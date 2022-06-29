package cz.acamar.tasks;

public class Task1 {

    public static final int ZERO_LENGTH = 0;
    public static final int ONE_LENGTH = 1;

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {

        if (ZERO_LENGTH != str.length()) {
            String[] splitString = str.split(" ");
            if (ZERO_LENGTH == splitString.length) {
                return ZERO_LENGTH;
            } else if (ONE_LENGTH == splitString.length) {
                return splitString[0].length();
            } else {
                return getLastLongestElementLength(splitString);
            }
        }
        return ZERO_LENGTH;
    }

    private int getLastLongestElementLength(String[] splitString) {
        int lengthOfArray = splitString.length;
        return splitString[lengthOfArray - ONE_LENGTH].length();
    }
}
