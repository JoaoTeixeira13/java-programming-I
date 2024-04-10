public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsOfASecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfASecond = new ClockHand(100);
    }

    public String toString() {
        return this.seconds + ":" + this.hundredthsOfASecond;
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

}
