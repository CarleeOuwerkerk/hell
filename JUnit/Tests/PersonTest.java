import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Carlee on 2016-11-07.
 */
public class PersonTest {

    Person person = new Person("Gerard");

    @Test
    public void testEquals() throws Exception {
        assertEquals("Gerard", person.getName());

    }

    @Test
    public void testNotEquals() throws Exception {
        assertNotEquals(null, person.getName());

    }

    @Test
    public void testTrue() throws Exception {
        assertFalse(person.isMale());

    }

    @Test
    public void testFalse() throws Exception {
        assertTrue(person.isMaleNow());

    }

    @Test
    public void testNull() throws Exception {
        assertNotNull(person.isMaleNow());

    }

    @Test
    public void testNotNull() throws Exception {
        assertNotNull(person.isMale());

    }

    @Test
    public void testAssertSame() throws Exception {
        assertSame(false, person.isMale());

    }

    @Test
    public void testAssertThat() throws Exception {
        assertThat(person.getName(), is(notNullValue()));

    }

    @Test
    public void testException() {
        try {
            person.throwException();
            assert false;
        } catch (RuntimeException e) {
            assert true;
        }
    }

    @Test
    public void testMap() throws Exception {
//        Field mapField = Person.class.getDeclaredField("map");
//        mapField.setAccessible(true);
//        HashMap map = (HashMap)  mapField.get(person);

        assertNull(person.addToMap);

    }
}