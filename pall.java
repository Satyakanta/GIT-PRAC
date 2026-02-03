import java.util.*;
public class pall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n , rev = 0 , m;
        System.out.println("Enter value for rev :- ");
        n = sc.nextInt();
        m= n;
        while(n>0){
            rev = (rev*10)+n%10;
            n = n/10;
        }
        System.out.println("rev = "+rev);
           if (m == rev ){
            System.out.println("It is pallindrome");
        }
        else{
            System.out.println("It is not a pallindrome");
        }
     
    }
}
