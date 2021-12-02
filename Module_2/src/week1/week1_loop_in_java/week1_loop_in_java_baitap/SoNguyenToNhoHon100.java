package week1.week1_loop_in_java.week1_loop_in_java_baitap;

public class SoNguyenToNhoHon100 {
    public static void main (String[] args){
        int n,count=0;
        int status = 1;
        int num = 3;
        System.out.println("các số nguyên tố bé hơn 100 là:");
        System.out.println(2);
        for ( int i = 2 ; i <=100 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 && num < 100)
            {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
        }
    }
}
