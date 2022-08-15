package question_19;

import java.util.Scanner;

public class qus_19 {
    public static void RPS(int n)
    {
        Scanner sc=new Scanner(System.in);
        double b,a;
        int AI=0,Human=0;
        for(int i=1;i<n;i++)
        {
            System.out.println("Enter the your input number:");
           a=sc.nextInt();
           b= Math.random();
           if(a>b)
           {
             AI++;
           }
           Human++;
           if(AI>2)
           break;
           if (Human>2)
           break;
        }
        if(AI>Human)
        {
            System.out.println("Human win ");
        }
        else if(AI==Human)
        {
            System.out.println("Draw");
        }
        else
        {
            System.out.println("AI win");
        }
        
    }
    public static void main(String[] args) {
        
        RPS(5);
    }
    
}
