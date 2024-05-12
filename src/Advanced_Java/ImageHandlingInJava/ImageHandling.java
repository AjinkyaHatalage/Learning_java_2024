package Advanced_Java.ImageHandlingInJava;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {
    public static void main(String[] args) throws IOException {
        int width = 963;
        int height = 640;

        BufferedImage image = null;
        image = readFromFile(width,height,image);

        writeToFile(image);
    }

    public static  BufferedImage readFromFile(int width , int height , BufferedImage image){
        try{
         File samplefile = new File("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\ImageHandlingInJava\\Synchan.jpg");

         image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);

         // Reading input file
            image = ImageIO.read(samplefile);
            System.out.println("Reading Complete");
        }
        catch (IOException e){
            System.out.println("Error for reading Image:  "+ e);
        }
        return image;
    }

    public static void writeToFile(BufferedImage image){
        try{
            File outputFile = new File("C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\ImageHandlingInJava\\OutputForSynchan.jpg");
            ImageIO.write(image,"jpg",outputFile);
            System.out.println("Writing Complete");
        }
        catch(IOException e){
            System.out.println("Error for writing image : "+e);
        }
    }
}
