package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int currentIndex = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentIndex] = in;
    }

    public boolean isEmpty() {
        return currentIndex == -1;
    }

    public boolean isFull() {
        return currentIndex == 11;
    }

    protected int peek() {
        if (isEmpty())
            return -1;
        return numbers[currentIndex];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return numbers[currentIndex--];
    }
}