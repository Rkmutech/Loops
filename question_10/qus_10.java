package question_10;

public class qus_10 {
    public static void sum_of_n_numbers(int n)
    {
        int total=0;
        for(int i=1;i<n;i++)
        {
            total+=i;

        }
        System.out.println("The total number of n is:"+total);

    }
    public static void main(String[] args) {
        sum_of_n_numbers(5);
        System.out.println("Next input :");
        sum_of_n_numbers(100);
        System.out.println("Next input :");
        sum_of_n_numbers(17);
        System.out.println("Next input :");
        sum_of_n_numbers(90);
        System.out.println("Next input :");
        sum_of_n_numbers(-89);
    }
    
}
