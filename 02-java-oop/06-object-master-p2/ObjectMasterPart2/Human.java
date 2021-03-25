public class Human
{
    protected int strength=3;
    protected int intelligence=3;
    protected int stealth=3;
    protected int health=100;
            //setters
    
        public void setStrength(int strength)
        {
            this.strength=strength;
        }
        public void setIntelligence(int intelligence)
        {
            this.intelligence=intelligence;
        }
        public void setStealth(int strength)
        {
            this.stealth=stealth;
        }
        public void setHealth(int Health)
        {
            this.health=health;
        }
        //getters

        public int getStrength()
        {
            this.strength=strength;
            return this.strength;
        }
        public int getIntelligence()
        {
            this.intelligence=intelligence;
            return this.intelligence;
        }
        public int getStealth()
        {
            this.stealth=stealth;
            return this.stealth;
        }
        public int getHealth()
        {
            this.health=health;
            return this.health;
        }

        public void attack(Human target)
        {
            System.out.printf("Beginning Health:  %d \n", this.health);
            target.health -= this.strength;
            System.out.printf("Health after attack:  %d", this.health);
         }
    
    }



