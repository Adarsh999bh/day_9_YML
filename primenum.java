import java.util.Scanner;
public class primenum{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isprime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
    private static boolean isprime(int fact){
        if(fact==2 || fact==3){
            return true;
        }
        else{
            for (int i = 2; i <= fact / 2; ++i) {
                if(fact%i==0){
                    return false;
                }
        }
        return true;
        }
    }
}