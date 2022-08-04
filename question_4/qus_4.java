package question_4;

public class qus_4 {
    public static void Odd_numbers(int n)
    {
        if(n>1)
        {
            for(int i=3;i<n;i++)
            {
                
                if(i%2==1)
                {
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("invalid number");
        }
        }
        
    public static void main(String[] args) {
        Odd_numbers(100);
        System.out.println("Next input:");
        Odd_numbers(2000);
        System.out.println("Next input:");
        Odd_numbers(1);
        System.out.println("Next input:");
        Odd_numbers(-78);
        System.out.println("Next input:");
        Odd_numbers(-4);
    }
    
}
