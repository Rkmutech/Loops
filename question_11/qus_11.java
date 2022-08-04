package question_11;

public class qus_11 {
    public static void even_total_number(int n)
    {
        int total=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                total+=i;
            }
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        even_total_number(89);
        even_total_number(10);
        
    }
    
}
