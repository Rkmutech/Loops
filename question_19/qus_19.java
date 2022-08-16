package question_19;

import java.util.Scanner;
import java.util.Random;

public class qus_19 {
    public static void RPS(int n)
    {
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();
        int  b,a;
        int AI=0,Human=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the your input number:");
           a=sc.nextInt();
           b = rand.nextInt(1000);
           System.out.println("This is a user number:");
           System.out.println(a);
           System.out.println("This is a AI number:");
           System.out.println(b);
           if(a>b)
           {
             AI++;
           }
           else if(a<b)
           {
            Human++;
           }
           
           /*if(AI>2)
           break;
           if (Human>2)
           break;*/
        }
        System.out.println("This Ai count"+AI);
        System.out.println("This Human count"+Human);
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
