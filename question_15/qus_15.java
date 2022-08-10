package question_15;

public class qus_15 {
    public static void main(String[] args) {
        factorial(5);
        
    }

    public static void factorial(int n)
    {
        int temp=1;
    for(int i=1;i<=n;i++)
    {
        temp*=i;
    }
    System.out.println(temp);

    }
    
}
