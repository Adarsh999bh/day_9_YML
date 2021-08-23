import java.util.Scanner;
public class perfect{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(perf(n)){
            System.out.println(n+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
    }
    private static boolean perf(int n){
        int summ=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                summ+=i;
            }
        }
        if(summ==n){
            //System.out.println(summ);
            return true;
        }
        else{
            //System.out.println(summ);
            return false;
        }
    }
}