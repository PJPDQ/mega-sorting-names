import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> readFile = new ArrayList<String>();
        String file = args[0];
        FileHandler rf = new FileHandler();
        readFile = rf.readFile(file);

        ArrayList<PeopleName> people = new ArrayList<PeopleName>();
        for (String name: readFile) {
            PeopleName data = new PeopleName(name);
            people.add(data);
        }
        Collections.sort(people);
        for (PeopleName name: people) {
            System.out.println(name.getLName() + " " + name.getFName() + "\n");
        }

        rf.writeFile(people, file);
    }
}
