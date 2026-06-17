public abstract class Caniformia {
    protected double furLength;
    public Caniformia(double furLength) {
        this.furLength = furLength;
    }
    public double getFurLength() {
        return furLength;
    }
    public void trackScent() {
        IO.println("Use strong sense of smell to lock onto scent paths.");
    }
    public abstract void communicate();
}
