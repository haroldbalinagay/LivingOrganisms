public class Chihuahua extends Caniformia {
    private double eyeSize;
    public Chihuahua(double furLength, double eyeSize) {
        super(furLength);
        setEyeSize(eyeSize);
    }
    public double getEyeSize() {
        return eyeSize;
    }
    public void setEyeSize(double eyeSize) {
        this.eyeSize = eyeSize;
    }
    public void wagTail() {
        IO.println("The chihuahua wags its tail in joy.");
    }
    @Override
    public void communicate() {
        IO.println("Barks to communicate with its owner and fellow chihuahuas.");
    }
}