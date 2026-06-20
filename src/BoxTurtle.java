public class BoxTurtle implements Ectothermic {
    private double shellThickness;
    public BoxTurtle(double shellThickness) {
        this.shellThickness = shellThickness;
    }
    public double getShellThickness() {
        return shellThickness;
    }
    @Override
    public void regulateTemperature() {
        IO.println("The box turtle burrows beneath damp leaf litter to escape severe afternoon heat.");
    }
}