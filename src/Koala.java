public class Koala implements Arboreal {
    private double clawLength;
    public Koala(double clawLength) {
        this.clawLength = clawLength;
    }
    public double getClawLength() {
        return clawLength;
    }
    @Override
    public void navigateTrees() {
        IO.println("The koala securely hugs the eucalyptus trunk and climbs slowly using its opposable digits.");
    }
}
