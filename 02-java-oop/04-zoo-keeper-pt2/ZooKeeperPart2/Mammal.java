public class Mammal{

    protected int energyLevel=300;

    public int displayEnergy()
    {
        System.out.println("energy Level" + this.energyLevel);
        return energyLevel;
    }

    public Mammal (int energyLevel){
        this.energyLevel= energyLevel;
    }
}