import java.util.*;
public class sum_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , add = 0 , n;
        System.out.println("Enter value of N :- ");
        n = sc.nextInt();
        for(i = 1 ; i<=n ; i++){
            add = add + i;
            
        }
        System.out.println("your total sum of n value : - "+add);
    }
    
}
