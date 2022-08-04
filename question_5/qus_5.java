package question_5;

public class qus_5 {
    public static void m_n_even_number(int m,int n)
    {
        if(m<n)
        {
            for(int i=m;i<n;i++)
            {
                if(i%2==0)
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
        m_n_even_number(100,200);
        System.out.println("Next input :");
        m_n_even_number(200,100 );
        System.out.println("Next input :");
        m_n_even_number(-90, 20);


    }
    
}
