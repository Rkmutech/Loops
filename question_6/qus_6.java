package question_6;

public class qus_6 {
    public static void m_n_Odd_number(int m,int n)
    {
        if(m<n)
        {
            for(int i=m;i<n;i++)
            {
                if(i%2==1)
                {
                    System.out.println(i);
                }
                
            }
        }
        else{
            System.out.println("Invalid value");
        }
        

    }
    public static void main(String[] args) {
        
        m_n_Odd_number(67, 89);
        System.out.println("Next input :");
        m_n_Odd_number(67, 67);
        System.out.println("Next input :");
        m_n_Odd_number(23, 56);

    }
    
}
