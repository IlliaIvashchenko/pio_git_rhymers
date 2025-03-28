package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public void countIn(int in) {
        if (!isEmpty() && in > peek()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}