public class Exception_handling_01{
    public static void main(String args[]) {
        int a=10, b=0;
        System.out.println("program started");
        try{
            int c = a/b;
            System.out.println(c);
        }

        catch(Exception e){
            System.out.println(e);
            System.out.println("program ended");
        }
        
    }
}