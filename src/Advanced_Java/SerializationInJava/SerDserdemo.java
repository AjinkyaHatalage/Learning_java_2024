package Advanced_Java.SerializationInJava;

import javax.imageio.IIOException;
import java.io.*;

public class SerDserdemo {
    public static void main(String[] args) {
        Serialization serialization = new Serialization("Ajinkya",23 ,"6/258 Ichalkaranji");
        serialization.setX(20);

        String filename = "C:\\Users\\ahatalage\\IdeaProjects\\Learning_java_2024\\src\\Advanced_Java\\SerializationInJava\\Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        //Serialization
        try{
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(serialization);

            objOut.close();
            fileOut.close();

            System.out.println("Object has been serialized : \n "+ serialization);
        }
        catch (IIOException | FileNotFoundException ex){
            System.out.println("IOException is caught");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deseialization
        FileInputStream fileIn = null;
        ObjectInputStream objin = null;
        try{
            fileIn = new FileInputStream(filename);
            objin = new ObjectInputStream(fileIn);

            Serialization object = (Serialization) objin.readObject();
            System.out.println("Object has been Deserialized : \n "+ object);
            System.out.println("Deserialized  value of x:  "+ object.getX());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Io Exception is caughts");
        } catch (ClassNotFoundException e) {
            System.out.println("classnotfoundexception "+ "is caught");
        }
    }
}
