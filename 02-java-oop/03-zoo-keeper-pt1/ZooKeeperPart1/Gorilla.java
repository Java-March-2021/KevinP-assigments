public class Gorilla extends Mammal
{
    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething()
    {
        energyLevel-=5;
        System.out.println("Energy Level has decrease to" + " " + this.energyLevel);
    }

    public void eatBananas()
    {
        energyLevel+=10;
        System.out.println("Energy Level increased to"+ " "+ + this.energyLevel);
    }

    public void climb()
    {
        energyLevel-=10;
        System.out.println("Energy Level has decrease to" + " "+ this.energyLevel);
        }
}