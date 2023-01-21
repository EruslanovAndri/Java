package Java.Lesson_1_Kamensky;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file_work {
    public static void main(String[] args) throws Exception{
        try(FileWriter fw = new FileWriter("file.txt",true)){
            fw.write("line 1");
            fw.append("\n");
            fw.append("2");
            fw.append("\n");
            fw.append("line 3");
            fw.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    FileReader fr = new FileReader("file.txt");
    int c;
    while((c = fr.read()) != -1){
        char ch = (char) c;
        if(ch == '\n'){
            System.out.print(ch);

        } else {
            System.out.print(ch);

        }
    }

    }
}

