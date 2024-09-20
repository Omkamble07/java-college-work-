import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileHandling{
    public static void main(String[] args) {
        
        try{
            File f = new File("C:\\Users\\acer\\Desktop\\java_EX\\ABCD.txt");
            if(f.createNewFile()){
                System.out.println("Sucessfully file is created");
            }
            else{
                System.out.println("File already exists");
            }

            FileWriter w = new FileWriter("C:\\\\Users\\\\acer\\\\Desktop\\\\java_EX\\\\ABCD.txt");
            w.write("java programming");
            w.close();
            System.out.println("Writing test sucessfully");

            FileReader r = new FileReader("C:\\\\Users\\\\acer\\\\Desktop\\\\java_EX\\\\ABCD.txt");
            r.read();
            r.close();
            System.out.println("file read sucessfully");

            // f.delete();
            // System.out.println("file is deleted");

        }
        catch(IOException i){
            System.out.println("exception is handled");
        }
    }

}