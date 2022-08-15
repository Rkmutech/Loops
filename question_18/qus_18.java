package question_18;

import java.util.Scanner;

public class qus_18 {
    
    public static void main(String[] args) {
        
        String choice="";
        Scanner sc=new Scanner(System.in);
            
        do{
            
            System.out.println("Enter the your input:");
            int n=sc.nextInt();

            if(n==1)
            {
                System.out.println("Enter the  number1:");
                int a=sc.nextInt();
                System.out.println("Enter the  number2:");
                int b=sc.nextInt();
                int c=a+b;
                System.out.println("Add of two numbers is:"+c);
            }
            else if(n==2)
            {
                System.out.println("Enter the  number1:");
                int a=sc.nextInt();
                System.out.println("Enter the  number2:");
                int b=sc.nextInt();
                int c=a-b;
                System.out.println("subraction  of two numbers is:"+c);
            }
            else if(n==3)
            {
                System.out.println("Enter the  number1:");
                int a=sc.nextInt();
                System.out.println("Enter the  number2:");
                int b=sc.nextInt();
                int c=a*b;
                System.out.println("Multiplication   of two numbers is:"+c);
            }
            else if(n==4)
            {
                System.out.println("Enter the  number1:");
                int a=sc.nextInt();
                System.out.println("Enter the  number2:");
                int b=sc.nextInt();
                int c=a/b;
                System.out.println("Division    of two numbers is:"+c);
            }
            else if(n==5)
            {
                System.out.println("Enter the  number1:");
                int a=sc.nextInt();
                System.out.println("Enter the  number2:");
                int b=sc.nextInt();
                int c=a%b;
                System.out.println("Modoul Division   of two numbers is:"+c);
            }
            else{
                System.out.println("Invalid number:");
            }
            System.out.println("Enter the Your choice: Yes or no");
            
               choice=sc.nextLine();
            
        }while(choice=="Yes");
    }
    
}
