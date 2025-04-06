package edu.kis.vh.nursery;

/**
 * Klasa FifoRhymer rozszerza DefaultCountingOutRhymer, implementując zachowanie kolejki FIFO
 * (First In, First Out) przy wyciąganiu wartości. Wykorzystuje tymczasowy rhymer do
 * odwracania kolejności elementów podczas operacji countOut.
 */
public class FifoRhymer extends DefaultCountingOutRhymer {

    protected final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Wyciąga najstarszą wartość z rhymera zgodnie z zasadą FIFO.
     * Używa tymczasowego rhymera do odwracania kolejności elementów,
     * aby symulować zachowanie kolejki.
     * 
     * @return najstarsza wartość w rhymerze
     */
    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}