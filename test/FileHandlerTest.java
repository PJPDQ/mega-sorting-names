import junit.framework.TestCase;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FileHandlerTest {
    ArrayList<String> names = new ArrayList<String>();
    String test1 = ".\\testcase.txt";
    String test2 = ".\\testcase-sorted.txt";
    String test3 = ".\\testcase-bla.txt"; //file does not exist
    FileHandler rf = new FileHandler();

    ArrayList<PeopleName> people = new ArrayList<PeopleName>();
    PeopleName john = new PeopleName("SMITH, JOHN");
    PeopleName francis = new PeopleName("KAREL, FRANCIS");
    PeopleName marina = new PeopleName("BOERANKO, MARINA");

    @Test(expected = FileNotFoundException.class)
    public void testUnknownFile() {
        rf.readFile(test3);
    }

    @Test
    public void testReadHandler() {
        names = rf.readFile(test1);

        assertEquals("BAKER, THEODORE", names.get(0));
        assertEquals("SMITH, ANDREW", names.get(1));
        assertEquals("KENT, MADISON", names.get(2));
        assertEquals("SMITH, FREDRICK", names.get(3));

        names = rf.readFile(test2);

        assertEquals("BAKER, THEODORE", names.get(0));
        assertEquals("KENT, MADISON", names.get(1));
        assertEquals("SMITH, ANDREW", names.get(2));
        assertEquals("SMITH, FREDRICK", names.get(3));
    }

    @Test(expected= IOException.class)
    public void testWriteHandler() {
        people.add(john);
        people.add(marina);
        people.add(francis);

        rf.writeFile(people, test3);
    }

    @Test
    public void testWritePeople() {
        people.add(john);
        people.add(marina);
        people.add(francis);

        rf.writeFile(people, "test0.txt");
        names = rf.readFile("test0-sorted.txt");
        people.clear();
        for (String name: names) {
            people.add(new PeopleName(name));
        }

        assertEquals(john.toString(), people.get(0).toString());
        assertEquals(marina.toString(), people.get(1).toString());
        assertEquals(francis.toString(), people.get(2).toString());
    }

    @Test
    public void main() {
        testReadHandler();
        testUnknownFile();
        testWriteHandler();
        testWritePeople();
    }
}