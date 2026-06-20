public class BlackBear extends Caniformia implements Arboreal{
    private double hibernationDuration;
    public BlackBear(double furLength, double hibernationDuration) {
        super(furLength);
        setHibernationDuration(hibernationDuration);
    }
    public double getHibernationDuration() {
        return hibernationDuration;
    }
    public void setHibernationDuration(double hibernationDuration) {
        this.hibernationDuration = hibernationDuration;
    }
    public void climbTree() {
        IO.println("The black bear climbs a tree using its sharp claws.");
    }
    @Override
    public void communicate() {
        IO.println("Growls at other animals or other bears.");
    }
    @Override
    public void navigateTrees() {
        IO.println("After climbing a tree black bears forage for nuts or escape danger.");
    }
}
