import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.err.println("first "+n+" fibonacci numbers are");
        int f1=0,f2=1,f3;
        if(n==1){
            System.out.println(f1);
        }
        else if(n==2){
            System.out.println(f1);
            System.out.println(f2);
        }
        else{
            System.out.println(f1);
            System.out.println(f2);
            for(int i=2;i<n;i++){
                f3=f2+f1;
                System.out.println(f3);
                f1=f2;
                f2=f3;
            }
        }
    }
}