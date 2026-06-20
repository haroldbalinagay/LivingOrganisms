public class Scorpion extends Arachnid implements Venomous{
    private double pincerSize;
    public Scorpion(boolean hasVenom, double pincerSize) {
        super(hasVenom);
        setPincerSize(pincerSize);
    }
    public double getPincerSize() {
        return pincerSize;
    }
    public void setPincerSize(double pincerSize) {
        this.pincerSize = pincerSize;
    }
    public void burrow() {
        IO.println("The scorpion digs into soil or sand to hide.");
    }
    @Override
    public void capturePrey() {
        IO.println("Grabs prey firmly with its pincers and stings it.");
    }
    @Override
    public void injectVenom() {
        IO.println("The scorpion strikes with its stinger to inject venom.");
    }
}
