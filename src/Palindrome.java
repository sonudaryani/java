import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int palinNo=0;
        int N=n;

        while(n>0){
            int digit = n%10;
            n= n/10;
            palinNo = (palinNo*10) + digit;
        }
        if(palinNo==N){
            System.out.println("This is a palindrome No.");
        }
        else{
            System.out.println("This is not a palindrome No.");
        }
    }
}