import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class PersonTest {

    //--------------  Test cases for the literels Strings  --------------------

    @Test
    public void test_case_for_same_string_literels() throws Exception {
        String simpleString = "banful";
        String object = new String("banful");
        boolean actual = simpleString.equals(object);
        boolean expected = true;
        assertEquals(actual,expected);
    }
    @Test
    public void test_case_for_diffrent_string_literels() throws Exception {
        String simpleString = "banful";
        String object = new String("samiksha");
        boolean actual = simpleString.equals(object);
        boolean expected = false;
        assertEquals(actual,expected);
    }
//
//    //--------------  Test cases for the Equals of person  --------------------
//
    @Test
    public void test_case_for_different_objects() throws Exception {
        Person p1 = new Person("kajal",19);
        Person p2 = new Person("shital",18);
        boolean actual = p1.equals(p2);
        boolean expected = false;
        assertEquals(actual,expected);
    }
//
    @Test
    public void test_case_for_same_objects() throws Exception {
        Person p1 = new Person("shital",18);
        Person p2 = new Person("shital",18);
        boolean actual = p1.equals(p2);
        boolean expected = true;
        assertEquals(actual,expected);
    }

// -------------- Test case for the hash code -----------------------
    @Test
    public void test_case_for_hash_code() throws Exception {
        Person p1 = new Person("shital",18);
        Person p2 = new Person("shital",18);
        int p1HashCode = p1.hashCode();
        int p2HashCode = p2.hashCode();
        assertEquals(p1HashCode,p2HashCode);
    }

    @Test
    public void test_case_for_hash_code_but_different_object_value() throws Exception {
        Person p1 = new Person("kajal",18);
        Person p2 = new Person("shital",18);
        int p1HashCode = p1.hashCode();
        int p2HashCode = p2.hashCode();
        assertNotSame(p1HashCode, p2HashCode);
    }
}
