

public class BasicJava
{
     public int numberFrom1To255()
     {
         int i=1;

         while (i<255)
         {
             System.out.println(i);
             i++;
         }
         return i;    

     }

    public int oddNumbersBetween1to255()
    {
        int j=1;
        for (j=1;j<255;j=j+2)
        {
            System.out.println(j);
        }
        return j;
        
    }

    public int  printSumNumbers()
    {
        int sum=0;

        for (int i=1;i<256;i++)
        {
            sum=sum+i;
            System.out.println("New number:" +" "+ i + " " + "Sum:" + " " + sum);
        }
        return sum;
    }


        public int iteratingThruArray()
        {
            int i=0;
            int  x[] ={1,3,5,7,9,13};
            for (i=0;i<x.length;i++)
            {
                System.out.println(x[i]);
            }
            return i;

        }

        public int findMax(int [] x){
                int max=0;
            for (int i=0; i<x.length; i++)
            {
                if(x[i]>max){
                    max=x[i];
                }
            }
            return max;


        }

        public int getAverage(int []y){
            {
                int i=0;
                int calc=0;
                int aver=0;
                 for (i=0;i<y.length;i++)
                 {
                    calc=calc+y[i];
                 }
                 aver=calc/y.length;
                
                 return aver;
            }


        }





}