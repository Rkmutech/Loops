package question_8;
/* display multiplication upto 20 for given number  */

public class qus_8 {
    public static void mutiplication_table_upto_20(int n)
    {  int i;
        for( i=1;i<=20;i++)
        {
            int total=i*n;
            System.out.println(i+"x"+n+"="+total);
        }
    }
    
    public static void main(String[] args) {
mutiplication_table_upto_20(8);
System.out.println("Next input :");
mutiplication_table_upto_20(9);
System.out.println("Next input :");
mutiplication_table_upto_20(10);
System.out.println("Next input :");
mutiplication_table_upto_20(5);


        
    }
    
}
