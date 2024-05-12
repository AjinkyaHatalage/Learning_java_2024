package Advanced_Java.IOStreamsInJava;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExamples {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try{
            inStream = new FileInputStream("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\IOStreamsInJava\\sample.txt");
            outStream = new FileOutputStream("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\IOStreamsInJava\\dest.txt");
            // read a byte at a time, if it reached end pf the file , returns -1
            int content;
            while ((content = inStream.read())!=-1){
                outStream.write((byte)content );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inStream != null){
               inStream.close();
            }
            if(outStream != null){
                outStream.close();
            }
        }
    }
}
