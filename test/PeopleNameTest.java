import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

public class PeopleNameTest {
    @Test
    public void main() {
        PeopleName john = new PeopleName("SMITH, JOHN");
        PeopleName francis = new PeopleName("KAREL, FRANCIS");
        PeopleName marina = new PeopleName("BOERANKO, MARINA");

        assertEquals(" FRANCIS", francis.getFName());
        assertEquals("KAREL", francis.getLName());

        assertEquals(" JOHN", john.getFName());
        assertEquals("SMITH", john.getLName());

        assertEquals(" MARINA", marina.getFName());
        assertEquals("BOERANKO", marina.getLName());

        assertEquals(1, john.compareTo(francis));
        assertEquals(1, francis.compareTo(marina));
        assertEquals(-1, marina.compareTo(john));
    }
}