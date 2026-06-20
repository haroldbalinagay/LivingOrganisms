public class Gecko extends Squamata implements Regenerative{
    private double gripStrength;
    public Gecko(String scaleColor,double gripStrength) {
        super(scaleColor);
        setGripStrength(gripStrength);
    }
    public double getGripStrength() {
        return gripStrength;
    }
    public void setGripStrength(double gripStrength) {
        this.gripStrength = gripStrength;
    }
    public void climbWall() {
        IO.println("The gecko utilizes setae hairs on its toes to climb vertical walls.");
    }
    @Override
    public void hunt() {
        IO.println("The gecko stalks and lunges to gnaw on small insects.");
    }
    @Override
    public void Regenerate() {
        IO.println("The gecko triggers cellular division to regrow its lost tail.");
    }
}
