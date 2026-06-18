public class Anaconda extends Squamata{
    private double coilLength;
    public Anaconda(String scaleColor, double coilLength) {
        super(scaleColor);
        setCoilLength(coilLength);
    }
    public double getCoilLength() {
        return coilLength;
    }
    public void setCoilLength(double coilLength) {
        this.coilLength = coilLength;
    }
    public void dive(){
        IO.println("The anaconda dives into the water to stay cool");
    }
    @Override
    public void hunt() {
        IO.println("Using its coils the anaconda constricts and strangles prey");
    }
}
