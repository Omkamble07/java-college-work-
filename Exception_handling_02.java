import java.util.Scanner;

public class Exception_handling_02{
    public static void main(String args[]) {

        System.out.println("program started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of dividend");
        int n = sc.nextInt();

        System.out.println("enter dividends");
        for (int i=0; i<n; i++){
            int d = sc.nextInt();
        }

        System.out.println("enter divisor");
        int di = sc.nextInt();
        try{
           for(int i=0; i<n ; i++){
            int R = i % di;
            System.out.println("Remainder:"+ R);
           }
        }

        catch(Exception e){
            System.out.println(e);
            System.out.println("program ended");
        }
        
    }
}