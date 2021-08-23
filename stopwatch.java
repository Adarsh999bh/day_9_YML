import java.util.Scanner;
public class stopwatch{
    public static void main(String[] args) {
        System.out.println("press 1 to start stopwatch");
        Scanner sc=new Scanner(System.in);
        String ent=sc.next();
        long start=System.currentTimeMillis();
        System.out.println("stopwatch started");
        System.out.println("press 1 to stop stopwatch");
        ent=sc.next();
        sc.close();
        System.out.println("elapsed time");
        System.out.println((System.currentTimeMillis()-start)+" milliseconds");

    }
}