public class BeardedDragon implements Ectothermic {
    private double scaleRoughness;
    public BeardedDragon(double scaleRoughness) {
        this.scaleRoughness = scaleRoughness;
    }
    public double getScaleRoughness() {
        return scaleRoughness;
    }
    @Override
    public void regulateTemperature() {
        IO.println("The bearded dragon flattens its body on a hot rock to maximize heat absorption.");
    }
}
