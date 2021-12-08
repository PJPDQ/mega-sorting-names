import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public ArrayList<String> readFile(String args) {
        ArrayList<String> res = new ArrayList<String>();
        try {
            File file = new File(args);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                res.add(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }

    private String createFile(String filename) {
        String[] files = filename.split(".txt");
        String newFile = null;
        try {
            newFile = ".\\" + files[0] + "-sorted.txt";
            File save = new File(newFile);
            if (save.createNewFile()) {
                return newFile;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;
    }

    public void writeFile(ArrayList<PeopleName> arr, String filename) {
        try {
            String newFile = this.createFile(filename);
            FileWriter save = new FileWriter(newFile);
            for (PeopleName name: arr) {
                String full = name.getLName() + "," + name.getFName() + "\n";
                save.write(full);
            }
            save.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
