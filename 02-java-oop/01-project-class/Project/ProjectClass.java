public class ProjectClass{
    private String name;
    private String description;
    private double initialCost= 0.00;
    

    public String getName()
        {
            return this.name;
        }
    
        public String getDescription()
        {
            return this.description;
        }

        public void setName(String name)
        {
            this.name=name;
        }
        

        public void setDescription(String description)
        {
            this.description=description;
        }

        public double SetinicialCost(){
            return this.initialCost;
        }

    public String elevatorPitch(String name,String description){
       
        return name + ":" + description;

    }

    public void Project() {
    }

    public String Project (String name){
        this.name=name;
        return name;
    }

    public String Project(String name, String description){
        this.name= name;
        this.description=description;
        return name + " " + description;
    }

    public void Project(String name,String description,double initialCost){
        this.name=name;
        this.description=description;
        this.initialCost=initialCost;
    }

    public void SetinicialCost(double initialCost)
    {
        this.initialCost=initialCost;
    }

    
        
}

       





