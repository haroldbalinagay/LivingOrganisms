public class TigerShark extends Chondrichthyes implements Nocturnal{
    private int stripeCount;
    public TigerShark(String typeOfHabitat, int stripeCount) {
        super(typeOfHabitat);
        setStripeCount(stripeCount);
    }
    public int getStripeCount() {
        return stripeCount;
    }
    public void setStripeCount(int stripeCount) {
        this.stripeCount = stripeCount;
    }
    public void detectElectricity() {
        IO.println("The tiger shark senses prey using electroreceptors in its snout.");
    }
    @Override
    public void swim() {
        IO.println("Swims quickly through coastal waters looking for food.");
    }
    @Override
    public void nightAction() {
        IO.println("The tiger shark moves closer to reefs at night to surprise sleeping prey.");
    }
}