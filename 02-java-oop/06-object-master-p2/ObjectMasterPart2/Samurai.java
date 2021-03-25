public class Samurai extends Human
{
    private static int numOfSamurai = 0;
    private static int defaultHealth = 200;

    public Samurai(){
          this.health = Samurai.defaultHealth;
        Samurai.numOfSamurai++;
    }

   public void deathBlow(Human target){
        target.health = 0;   this.health = (this.health / 2);    }

   public void meditate(){
        this.health = Samurai.defaultHealth;
    }

    public static int howMany() {
        System.out.printf("The total number of Samurai is: %d", Samurai.numOfSamurai);
        return Samurai.numOfSamurai;
    }
}