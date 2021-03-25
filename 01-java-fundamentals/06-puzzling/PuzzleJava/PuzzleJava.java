
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//import java.util.Random;

public class PuzzleJava {

  

    public void numbersGreatherThan10(){

    
        int[] numbers = {3,5,1,2,7,9,8,13,25,32};
        int [] greaterThan10 = new int[numbers.length];
        int sum = 0;
        int acum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            if (numbers[i]>10)
            {
                greaterThan10[acum] = numbers[i];
                acum++;
            }

        }
        System.out.println(sum);
        System.out.println(Arrays.toString(greaterThan10));
    }




        public ArrayList<String> stringArray(){
             ArrayList<String>persons = new ArrayList<String>(Arrays.asList("Nancy", "john","Mary", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
             System.out.println("Names in this array"+ persons);

             
             ArrayList<String> longerNames = new ArrayList<String>();
                Collections.shuffle(persons);
                System.out.println("Names shuffled:" + persons);

            for (int i=0; i<persons.size();i++)
            {
                if(persons.get(i).length()>5)
                {
                        longerNames.add(persons.get(i));        
                }
             }
               
                System.out.println("Names whith more than 5 letters");
                System.out.println(longerNames);
                return (longerNames);

            }


            public void puzzling()
            {
                ArrayList<Character> alphabet = new ArrayList<Character>();


                for (char ch='a'; ch<='z';ch++)
                {
                    alphabet.add(ch);
                }
                    System.out.println("letters of the alphabet" + alphabet);
                    Collections.shuffle(alphabet);
                    System.out.println("shuffled letters" + alphabet);
                    System.out.println("last letter of the shuffled alphabet" + " " +alphabet.get(alphabet.size()-1));
                    System.out.println("1st letter of the shuffled alphabet" + " " + alphabet.get(0));
            
            
            ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));

            for (int i=0; i < vowels.size(); i++)
            {
                    if (alphabet.get(0) == vowels.get(i))
                    {
                        System.out.println("First character is a vowel" + " "+  alphabet.get(0));
                    }


                }
            }
        

            public  void NumberBetween55to100()
            {
                ArrayList<Integer> showArray = new ArrayList<Integer>();
                
                Random r = new Random();
                int min= 55;
                int max=100;
                int randomNum = r.nextInt((max-min)+min);

                    for (int e=0; e<10; e++)   
                    { 
                     randomNum = r.nextInt((max-min)+min);
                        
                          showArray.add(randomNum);
                        
                    }
                        System.out.println("10 Random Numbers in between 55-100");
                        System.out.println(showArray);
                    

                    
            }
        
                    
                 

}
 