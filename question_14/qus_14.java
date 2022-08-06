package question_14;

import java.util.Scanner;

public class qus_14 {
    public static void division(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(i%3==0)
            {
                System.out.println("Fizz");
            }
             if(i%5==0)
            {
                System.out.println("Buzz");
            }
             if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the your number: ");
        int n=obj.nextInt();
        division( n);
        division(10);
        division(100);
        division(2);
        division(1000);
        
    }
    
}
