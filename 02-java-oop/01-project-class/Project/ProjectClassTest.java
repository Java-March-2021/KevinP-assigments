
public class ProjectClassTest{
    public static void main (String[]args){

        
        ProjectClass webFundamentals= new ProjectClass();
        ProjectClass JavaFundamentals= new ProjectClass();
        ProjectClass value= new ProjectClass();

       webFundamentals.setName("Web Fundamentals");
       webFundamentals.setDescription("You will learn how to use HTMAL and CSS");
       

        JavaFundamentals.setName("Java Fundamentals");
        JavaFundamentals.setDescription("You will learn how to programming and make life easy for others");
       
        String html= webFundamentals.Project("HTML");
        System.out.println(html);

        String nameAndDesc= webFundamentals.Project("SQL","How to manipulate the databases");
        System.out.println(nameAndDesc);
       
       String pitch = webFundamentals.elevatorPitch("Project", "Test If the Elevator Pitch is working");
       System.out.println(pitch);

        System.out.println(webFundamentals.getName());
        System.out.println(webFundamentals.getDescription());



        

    }
    }