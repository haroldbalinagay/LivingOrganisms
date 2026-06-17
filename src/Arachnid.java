public abstract class Arachnid {
    protected boolean hasVenom;
    public Arachnid(boolean hasVenom) {
        this.hasVenom = hasVenom;
    }
    public boolean checkVenom() {
        return hasVenom;
    }
    public void molt() {
        IO.println("Shedding the old exoskeleton.");
    }
    public abstract void capturePrey();
}
