public class Spider extends Arachnid{
    private double legLength;
    public Spider(boolean hasVenom, double legLength) {
        super(hasVenom);
        setLegLength(legLength);
    }
    public double getLegLength() {
        return legLength;
    }
    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }
    public void makeWebs() {
        IO.println("The spider makes a web out of silk");
    }
    @Override
    public void capturePrey() {
        IO.println("Waits in a sticky web to catch flying insects.");
    }
}
