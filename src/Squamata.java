public abstract class Squamata {
    protected String scaleColor;
    public Squamata(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    public String getScaleColor() {
        return scaleColor;
    }
    public void ecdysis() {
        IO.println("Shedding the old skin to allow for growth.");
    }
    public abstract void hunt();
}
