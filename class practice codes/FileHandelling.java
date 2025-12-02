import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandelling {
    public static void main(String[] args) throws IOException {
try {
    File file = new File("data.txt");
    if (file.createNewFile()){
        System.out.println("File Created SucessFully");
    }
    else {
        System.out.println("File Already Exist");
    }

}
catch (IOException e){
    e.printStackTrace();
}


//Write the File

try {
    FileWriter fw = new FileWriter("data.txt");

    fw.write("Hello I am Abhishekh yadav");
    fw.close();
}
catch (IOException e){
    e.printStackTrace();
}


//Read THe FIle
try {
    FileReader fr= new FileReader("data.txt");
    int ch;

    while ((ch=fr.read()) != -1){
        System.out.print((char)ch);
    }
}
catch (IOException e){
    e.printStackTrace();
}
        System.out.println();

//File Read With the Help of BufferedReader

        try {
            BufferedReader brf = new BufferedReader(new FileReader("data.txt"));
            String str;
            while ((str = brf.readLine()) != null){
                System.out.print(str);
            }
            brf.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }





    }
}