import java.io.*;

class CreateFile{
    public static void main(String [] args){
        File f = new File("C:\\Users\\acer\\Desktop\\java_EX\\ABCD.txt");
        try{
            if(f.createNewFile()){
            System.out.println("file is created");
            }
            else{
                System.out.println("file is already exits");
            }
        }

        catch(IOException i){
            System.out.println("exception is handled");
        }
    }
} 