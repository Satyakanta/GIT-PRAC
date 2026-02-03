import java.util.*;
public class sum_OD {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value :- ");
        n = sc.nextInt();
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("sum of digits :- "+sum);
    }
    
}
