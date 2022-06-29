package cz.acamar.tasks;

public class Task2 {

    public static final int ZERO_LENGTH = 0;
    public static final int ONE_LENGTH = 1;
    public static final int SQUARE = 2;

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {

        if (ZERO_LENGTH == input.length) {
            throw new IndexOutOfBoundsException();
        } else {
            if (ONE_LENGTH == input.length) {
                return new int[]{(int) Math.pow(input[ZERO_LENGTH], SQUARE)};
            } else {
                return getSquaredItems(input);
            }
        }

    }

    private int[] getSquaredItems(int[] input) {
        int lengthOfArray = input.length;
        int[] squares = new int[lengthOfArray];
        int highestSquareIdx = lengthOfArray - 1;
        int leftIndex = 0, rightIndex = input.length - 1;
        while (leftIndex <= rightIndex) {
            int leftSquare = input[leftIndex] * input[leftIndex];
            int rightSquare = input[rightIndex] * input[rightIndex];
            if (leftSquare > rightSquare) {
                squares[highestSquareIdx--] = leftSquare;
                leftIndex++;
            } else {
                squares[highestSquareIdx--] = rightSquare;
                rightIndex--;
            }
        }
        return squares;
    }
}
