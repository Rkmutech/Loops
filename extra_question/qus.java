package extra_question;

import java.util.Scanner;

/* To get n numbers and sum all the numbers end with 6 */

public class qus {
    public static void end_6(int n)
    {
        int count=0,sum=0;
        Scanner sc=new Scanner(System.in);
        if(count>n)
        {
            count++;
        int a=sc.nextInt();
         int temp=a%10;
         if(temp==6)
         {
           sum+=temp;
         }
         System.out.println(sum);
            
        }
    }

    public static void main(String[] args) {
        end_6(5);
        
    }
    
}
