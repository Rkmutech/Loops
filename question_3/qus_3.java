package question_3;

public class qus_3 {
    public static void even_number(int n)
    {
        if(n>1)
        {
            for(int i=1;i<n;i++)
          {
            if(i%2==0)
            {
                System.out.println(i);
            }
          }

        }
        else 
        {
            System.out.println("Invalid input ");
        }
          
    }
    public static void main(String[] args) {
        even_number(100);
        System.out.println("Next input number:");
        even_number(50);
        System.out.println("Next input number:");
        even_number(90);
        System.out.println("Next input number:");
        even_number(-78);
        System.out.println("Next input number:");
        even_number(1);
        even_number(-200);
        System.out.println("Next input number:");
        
    }
    
}
