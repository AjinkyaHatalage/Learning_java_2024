package Advanced_Java.IOStreamsInJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader readerStream = null;
        FileWriter writerStream = null;
        try{
            readerStream = new FileReader("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\IOStreamsInJava\\sample.txt");
            writerStream = new FileWriter("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\IOStreamsInJava\\character_dest.txt");
            // Reading source file and writing content to target file by character
            int content;
            while((content = readerStream.read())!=-1){
                writerStream.append((char) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(readerStream != null){
                readerStream.close();
            }
            if(writerStream != null){
                writerStream.close();
            }
        }
    }
}
