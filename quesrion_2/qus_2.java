package quesrion_2;

public class qus_2 {
    public static void m_n_number(int m,int n)
    {
        if(m<n)
        {
            for(int i=m;i<n;i++)
            {
                
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
        m_n_number(90,48 );
        System.out.println("Next input:");
        m_n_number(56, 300);
        System.out.println("Next input:");
        m_n_number(78, 12);
        
    }
    
}
