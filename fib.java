import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int x = 0 , sum =0 , y=1 , n;     //term = 1
        System.out.println("Enter value:- ");
        n = sc.nextInt();
        while (sum<=n) {                         //(term<=n)
            System.out.println(sum);
            x=y;
            y=sum;
            sum = x+y;
            //term++;
        }
    }
}
