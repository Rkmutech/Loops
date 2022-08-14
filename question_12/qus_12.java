package question_12;

public class qus_12 {
    public static void  odd_total_number(int n)
        {
            int sum=0;
            for(int i=2;i<=n;i++)
            {
if(i%2==1)
{
     sum+=i;
}

            }
            System.out.println(sum);
        }
    public static void main(String[] args) {
        
        
        odd_total_number(9);
        System.out.println("Next output ");
        odd_total_number(78);
        
    }
    
}
