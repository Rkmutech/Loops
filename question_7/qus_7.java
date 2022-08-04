package question_7;

public class qus_7 {
    public static void divisible_given_number(int n){
        if(n<100 && n>1)
        {
            for(int i=1;i<100;i++)
            {
                if(i%n==0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            System.out.println("invalid value");
        }

    }
    public static void main(String[] args) {
        divisible_given_number(45);
        System.out.println("Next input :");
        divisible_given_number(5);
        System.out.println("Next input :");
        divisible_given_number(-78);
        System.out.println("Next input :");
        divisible_given_number(-1);
        System.out.println("Next input :");
        divisible_given_number(-200);
        System.out.println("Next input :");
        divisible_given_number(90);

    }
    
}
