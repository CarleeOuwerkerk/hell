import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by foxma on 11/8/2016.
 */
public class jtestTest {

    jtest matt =new jtest("matt",6,true);
    @Test
    public void ewals() throws Exception {
        assertEquals("matt",matt.getPerson());

    }

    @Test
    public void equals() throws Exception {
        assertNotEquals(7,matt.getAge());
    }

    @Test
    public void notnull() throws Exception {
        assertNotNull(matt.getAge());
    }

    @Test
    public void same() throws Exception {
        assertSame(true,matt.isSame_i_am());

    }

    @Test
    public void that() throws Exception {
        assertThat(matt.getAge(),is(notNullValue()));
    }


}

// make a class that is privet and throws and error
//