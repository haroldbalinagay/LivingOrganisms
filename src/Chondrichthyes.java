public abstract class Chondrichthyes {
    private String typeOfHabitat;
    public Chondrichthyes(String typeOfHabitat) {
        this.typeOfHabitat = typeOfHabitat;
    }
    public String typeOfHabitat() {
        return typeOfHabitat;
    }
    public void stayBouyant() {
        IO.println("Uses oily liver to avoid sinking");
    }
    public abstract void swim();
}
