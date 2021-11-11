package lotto.domain;

public class Playslip {

    private final PickedNumbers pickedNumbers;

    public Playslip(final PickedNumbers pickedNumbers) {
        this.pickedNumbers = pickedNumbers;
    }

    public boolean contains(PickedNumbers winningNumbers, int x) {
        return pickedNumbers.contains(winningNumbers, x);
    }

    @Override
    public String toString() {
        return pickedNumbers.toString();
    }
}
