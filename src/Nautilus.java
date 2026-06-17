public class Nautilus extends Cephalopod{
    private double shellDiameter;
    public Nautilus(int tentacleCount, double shellDiameter) {
        super(tentacleCount);
        setShellDiameter(shellDiameter);
    }
    public double getShellDiameter() {
        return this.shellDiameter;
    }
    public void setShellDiameter(double shellDiameter) {
        this.shellDiameter = shellDiameter;
    }
    public void migrate(){
        IO.println("Nautilus migrate to hunt or avoid predators depending on the time.");
    }
    @Override
    public void defense() {
        IO.println("The nautilus hides in its shell.");
    }
}
