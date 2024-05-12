package Advanced_Java.NonBlockingIOPackageInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args)  throws IOException {
        // reading to a file
        FileInputStream fin1 = new FileInputStream("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\NonBlockingIOPackageInJava\\Source_AJ.txt");
        FileChannel readChannel = fin1.getChannel();
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("File read Succesfully "+ result);

        // Writing in a file :
        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\NonBlockingIOPackageInJava\\DEST_Aj.txt");
        FileChannel writeChannel = fout1.getChannel();
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message  = "This is a test String";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("File write Successfully");
    }
}
