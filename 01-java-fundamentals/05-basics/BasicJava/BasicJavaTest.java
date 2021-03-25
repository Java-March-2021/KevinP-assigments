public class  BasicJavaTest

{
   public static void main (String[]args)
{
    BasicJava iD= new BasicJava();
    int nums= iD.numberFrom1To255();
    System.out.println(nums);


    int oddnums= iD.oddNumbersBetween1to255();
    System.out.println(oddnums);

    int sumNumbers= iD.printSumNumbers();
    System.out.println(sumNumbers);
    

    
    int showArray= iD.iteratingThruArray();
    System.out.println(showArray);

    int []x={-5,-15,-12,-54,-12};
    int maxVal= iD.findMax(x);
    System.out.println(("the maximun value is "+ (maxVal)));


    int []y={10,2,3};
    int average= iD.getAverage(y);
    System.out.println(("the average for this numbers is "+ (average)));
}
}