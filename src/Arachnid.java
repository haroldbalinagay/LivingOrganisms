public abstract class Arachnid {
    private boolean hasVenom;
    public Arachnid(boolean hasVenom) {
        this.hasVenom = hasVenom;
    }
    public boolean checkVenom() {
        return hasVenom;
    }
    public void molt() {
        System.out.println("Shedding the old exoskeleton.");
    }
    public abstract void capturePrey();
}
