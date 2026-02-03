import java.util.*;
public class primen {
    public static void main(String[] args) {
        int n , i , j , count = 0 ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value upto find prime : - ");
        n = sc.nextInt();
        for( i = 2 ; i<=n ; i++){
            for(j = 2; j<=i ; j++){
                if(i%j==0){
                    
                    break;
                }
                

            }
            
            if(i==j){
                count++;
                System.out.println(i);
                
               
                
            }
           
        }
        System.out.println("-"+count);
    }
}
