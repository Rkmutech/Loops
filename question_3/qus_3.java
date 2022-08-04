package question_3;

public class qus_3 {
    public static void even_number(int n)
    {
          for(int i=1;i<n;i++)
          {
            if(i%2==0)
            {
                System.out.println(i);
            }
          }
    }
    public static void main(String[] args) {
        even_number(100);
        System.out.println("Next input number");
        even_number(50);
        
    }
    
}
