public class Bat extends Mammal
{
    
    public Bat(int energyLevel)
    {  
         super(energyLevel);
    }

    public void fly()
    {
        energyLevel-=50;
        System.out.println("WOOH!! Energy level has decrease to"  + " "+ this.energyLevel);
    }

    public void eatHumans()
    {
        energyLevel+=25;
        System.out.println("Energy levenl has increased to " + " " + this.energyLevel);
    }

    public void attackTown()
    {
        energyLevel-=100;
        System.out.println("AHHHH! HELP, CALL 911!!!" + " " +  "Energy Level decrease" + this.energyLevel);
    }
}