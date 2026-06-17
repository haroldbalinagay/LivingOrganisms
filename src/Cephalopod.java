public abstract class Cephalopod {
    private int tentacleCount;
    public Cephalopod(int tentacleCount){
        this.tentacleCount = tentacleCount;
    }
    public int getTentacleCount() {
        return tentacleCount;
    }
    public void propel() {
        IO.println("The cephalopod uses its tentacles to propel itself");
    }
    public abstract void defense();
}
