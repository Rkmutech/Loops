package question_17;

import java.util.Scanner;

public class qus_17 {
    public static void marks(int n)
    {
        int total=0;
        float Avg=0;
       for(int i=1;i<n;i++)
       {  Scanner obj=new Scanner(System.in);
           System.out.println("Enter the Your marks:");
           int m1=obj.nextInt();
           total+=m1;
           Avg=total/n;
           
           
       }
       System.out.println("Total:"+total);
           System.out.println("Average:"+Avg);
    }
    public static void main(String[] args) {
        marks(5);
        //marks(8);
        //marks(3);
        //marks(7);
        
    }
    
}
