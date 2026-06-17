public class Octopus extends Cephalopod{
    private int iq;
    public Octopus(int tentacleCount, int iq) {
        super(tentacleCount);
        setIq(iq);
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public void grab() {
        IO.println("Using their tentacles and suckers they tightly grab on to prey.");
    }
    @Override
    public void defense() {
        IO.println("Changes skin texture and color to blend with environment.");
    }
}
