package strategy2;

import java.util.Arrays;

public class Merge implements IAlgoritmos{
    private double[] list;
    private int y = 1;

    public double[] run(double[] whole, int y) {
        if (whole.length == 1) {
            return whole;
        }
        else {
            double[] left = new double[whole.length / 2];
            System.arraycopy(whole, 0, left, 0, left.length);

            double[] right = new double[whole.length - left.length];
            System.arraycopy(whole, left.length, right, 0, right.length);

            left = run(left, y);
            right = run(right, y);

            merge(left, right, whole);

            return whole;
        }
    }

    private void merge(double[] left, double[] right, double[] whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                whole[wholeIndex] = left[leftIndex];
                leftIndex++;
            }
            else {
                whole[wholeIndex] = right[rightIndex];
                rightIndex++;
            }
            wholeIndex++;
        }

        double[] rest;
        int restIndex;
        if (leftIndex >= left.length) {
            // The left array has been use up...
            rest = right;
            restIndex = rightIndex;
        }
        else {
            // The right array has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever array (left or right) was
        // not used up.
        for (int i = restIndex; i < rest.length; i++) {
            whole[wholeIndex] = rest[i];
            wholeIndex++;
        }
    }
}
