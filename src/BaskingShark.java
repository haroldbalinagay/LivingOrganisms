public class BaskingShark extends Chondrichthyes{
    private double gillRakerLength;
    public BaskingShark(String typeOfHabitat, double gillRakerLength) {
        super(typeOfHabitat);
        setGillRakerLength(gillRakerLength);
    }
    public double getGillRakerLength() {
        return gillRakerLength;
    }
    public void setGillRakerLength(double gillRakerLength) {
        this.gillRakerLength = gillRakerLength;
    }
    public void filterWater() {
        IO.println("The basking shark filters tons of water looking for plankton.");
    }
    @Override
    public void swim() {
        IO.println("Swims slowly near the ocean surface with its mouth wide open.");
    }
}
