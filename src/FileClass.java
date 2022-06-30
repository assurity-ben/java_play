import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) {
        try {
            File myObj = new File("test.txt");
            if (myObj.createNewFile()) {
                P.print("File created : " + myObj.getName());
            } else {
                P.print("File already exists.");
            }
        } catch (IOException e) {
            P.print("An error occurred.");
            e.printStackTrace();
        }
        // creating the file can be done when opening for writing
        writeToFile("test.txt");
        // read the file
        readFile("test.txt");
        // get file info
        getFileInfo("test.txt");
        // delete file
        deleteFile("test.txt");
        deleteFile("test1.txt");
    }

    static void writeToFile(String filename) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write("Some text that has been written to a file");
            myWriter.close();
            P.print("Successfully wrote to file.");
        } catch (IOException e) {
            P.print("An error occurred.");
            e.printStackTrace();
        }
    }

    static void readFile(String filename) {
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            P.print("Reading file: " + filename);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                P.print(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            P.print("File not found");
            e.printStackTrace();
        }
    }

    static void getFileInfo(String filename) {
        File myObj = new File(filename);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    static void deleteFile(String filename) {
        File myObj = new File(filename);
        if (myObj.delete()) {
            P.print("Deleted the file: " + myObj.getName());
        } else {
            P.print("Failed to delete the file.");
        }
    }
}
