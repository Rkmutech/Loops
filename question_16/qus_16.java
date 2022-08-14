package question_16;

import java.util.Scanner;

public class qus_16 {
    public static void play_round(int n)
    {
        int sum=0;
        Scanner obj=new Scanner(System.in);

       for(int i=0;i<=n;i++)
       {
        System.out.println("Enter the input:");
          int a=obj.nextInt();
           sum+= a;
       }
       System.out.println(sum);
    }
    public static void main(String[] args) {
        play_round(5);
        
    }
    
}
