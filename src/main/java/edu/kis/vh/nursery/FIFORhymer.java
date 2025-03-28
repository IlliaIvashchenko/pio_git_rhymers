package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temporaryStack = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!isEmpty())
            temporaryStack.countIn(super.countOut());

        int ret = temporaryStack.countOut();

        while (!temporaryStack.isEmpty())
            countIn(temporaryStack.countOut());

        return ret;
    }
}