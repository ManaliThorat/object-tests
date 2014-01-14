import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Created by manalit on 1/14/14.
 */
public class MyComparatorTest {
    @Test
    public void testEquals() throws Exception {
        MyComparator swamiji = new MyComparator("Swamiji", 3);
        MyComparator kunal = new MyComparator("Kunal", 50);
        MyComparator digvijay = new MyComparator("Digvijay", 35);
        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people);
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i <3 ; i++) {
            actual.append(people.get(i)).append("\n");
        }
        String result = actual.toString();
        String expected = "Digvijay\nKunal\nSwamiji\n";
        assertEquals(result,expected);
    }
    @Test
    public void testEquals_sort_as_per_length() throws Exception {
        MyComparator swamiji = new MyComparator("Swamiji", 3);
        MyComparator kunal = new MyComparator("Kunal", 50);
        MyComparator digvijay = new MyComparator("Digvijay", 35);
        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people);
        Collections.sort(people, new Comparator<MyComparator>() {
    @Override
            public int compare(MyComparator p1, MyComparator p2) {
                return p1.getName().length()-p2.getName().length();
            }
        });
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i <3 ; i++) {
            actual.append(people.get(i)).append("\n");
        }
        String result = actual.toString();
        String expected = "Kunal\nSwamiji\nDigvijay\n";
        assertEquals(result,expected);
    }
         public static List addPeopleToList(MyComparator... persons){
            List<MyComparator> people = new ArrayList<MyComparator>();
            for (MyComparator person : persons) {
                people.add(person);
            }
            return people;
        }

    @Test
    public void testEquals_sort_as_per_ascending_order_by_age() throws Exception {
        MyComparator swamiji = new MyComparator("Swamiji", 3);
        MyComparator kunal = new MyComparator("Kunal", 50);
        MyComparator digvijay = new MyComparator("Digvijay", 35);
        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people);
        Collections.sort(people, new Comparator<MyComparator>() {
            @Override
            public int compare(MyComparator p1, MyComparator p2) {
                return p1.getAge()-p2.getAge();
            }
        });
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i <3 ; i++) {
            actual.append(people.get(i)).append("\n");
        }
        String result = actual.toString();
        String expected = "Swamiji\nDigvijay\nKunal\n";
        assertEquals(result,expected);
    }
    @Test
    public void testEquals_sort_as_per_descending_order_by_age() throws Exception {
        MyComparator swamiji = new MyComparator("Swamiji", 3);
        MyComparator kunal = new MyComparator("Kunal", 50);
        MyComparator digvijay = new MyComparator("Digvijay", 35);
        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people);
        Collections.sort(people, new Comparator<MyComparator>() {
            @Override
            public int compare(MyComparator p1, MyComparator p2) {
                return p2.getAge()-p1.getAge();
            }
        });
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i <3 ; i++) {
            actual.append(people.get(i)).append("\n");
        }
        String result = actual.toString();
        String expected = "Kunal\nDigvijay\nSwamiji\n";
        assertEquals(result,expected);
    }

    @Test
    public void testEquals_sort_as_per_descending_order_by_name() throws Exception {
        MyComparator swamiji = new MyComparator("Swamiji", 3);
        MyComparator kunal = new MyComparator("Kunal", 50);
        MyComparator digvijay = new MyComparator("Digvijay", 35);
        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
        Collections.sort(people);
        Collections.sort(people,Collections.reverseOrder( new Comparator<MyComparator>() {
            @Override
            public int compare(MyComparator p1, MyComparator p2) {
                return p2.getName().compareTo(p1.getName());
            }
        }));
        StringBuilder actual = new StringBuilder();
        for (int i = 0; i <3 ; i++) {
            actual.append(people.get(i)).append("\n");
        }
        String result = actual.toString();
        String expected = "Digvijay\nKunal\nSwamiji\n";
        assertEquals(result,expected);
    }
        public boolean compareList(List ls1,List ls2){
            return ls1.toString().contentEquals(ls2.toString())?true:false;
        }
    @Test
    public void testEquals_arraylists_are_not_equals() throws Exception {
        List<Person> one  = new ArrayList<Person>();
        List<Person> two  = new ArrayList<Person>();
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Kunal", 50);
        Person digvijay = new Person("Digvijay", 35);
        one.add(swamiji);
        one.add(kunal);
        one.add(digvijay);

        two.add(swamiji);
        two.add(digvijay);
        two.add(kunal);
        boolean[] result = new boolean[3];
        for (int i = 0; i < 3 ; i++)
            result[i] = one.get(i).equals(two.get(i));

        boolean[] expected = {true,false,false};

        for (int i = 0; i < 3 ; i++) {
            assertEquals(result[i],expected[i]);
        }

    }
    @Test
    public void testEquals_arraylists_are_equals() throws Exception {
        List<Person> one  = new ArrayList<Person>();
        List<Person> two  = new ArrayList<Person>();
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Kunal", 50);
        Person digvijay = new Person("Digvijay", 35);
        one.add(swamiji);
        one.add(kunal);
        one.add(digvijay);

        two.add(swamiji);
        two.add(kunal);
        two.add(digvijay);
        boolean[] result = new boolean[3];
        for (int i = 0; i < 3 ; i++)
            result[i] = one.get(i).equals(two.get(i));

        boolean[] expected = {true,true,true};

        for (int i = 0; i < 3 ; i++) {
            assertEquals(result[i],expected[i]);
        }

    }
    @Test
    public void test_for_hashmap_same_objects_in_one_list() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Swamiji", 3);
        Person manali = new Person("Manali", 3);
        Person shital = new Person("Shitai", 50);
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();
        Map<String,List<Person>> map = new HashMap<String,List<Person>>();
        list1.add(swamiji);
        list1.add(kunal);
        list1.add(manali);
        list1.add(shital);
        map.put("A",list1);
        map.put("B",list2);
        List res = map.get("A");
        int p1hashcode = res.get(0).hashCode();
        int p2hashcode = res.get(1).hashCode();

        boolean actual = res.get(0).equals(res.get(1));
        assertEquals(true,actual);
        assertEquals(p1hashcode,p2hashcode);
    }
    @Test
    public void test_for_hashmap_same_objects_in_one_list_false() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Kunal", 3);
        Person manali = new Person("Manali", 3);
        Person shital = new Person("Shitai", 50);
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();
        Map<String,List<Person>> map = new HashMap<String,List<Person>>();
        list1.add(swamiji);
        list1.add(kunal);
        list1.add(manali);
        list1.add(shital);
        map.put("A",list1);
        map.put("B",list2);
        List res = map.get("A");
        int p1hashcode = res.get(0).hashCode();
        int p2hashcode = res.get(1).hashCode();
        boolean actual = res.get(0).equals(res.get(1));
        assertEquals(false,actual);
        assertNotSame(p1hashcode, p2hashcode);

    }
    @Test
    public void test_for_hashmap_same_objects_in_another_list() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Swamiji", 3);
        Person manali = new Person("Swamiji", 3);
        Person shital = new Person("Shitai", 50);
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();
        Map<String,List<Person>> map = new HashMap<String,List<Person>>();
        list1.add(swamiji);
        list1.add(kunal);
        list2.add(manali);
        list2.add(shital);
        map.put("A",list1);
        map.put("B",list2);
        List res = map.get("A");
        List res2 = map.get("B");
        boolean actual = res.get(0).equals(res2.get(0));
        assertEquals(true,actual);
    }

    @Test
    public void test_for_hashmap_same_objects_in_another_list_false() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Swamiji", 3);
        Person manali = new Person("Manali", 3);
        Person shital = new Person("Shitai", 50);
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();
        Map<String,List<Person>> map = new HashMap<String,List<Person>>();
        list1.add(swamiji);
        list1.add(kunal);
        list2.add(manali);
        list2.add(shital);
        map.put("A",list1);
        map.put("B",list2);
        List res = map.get("A");
        List res2 = map.get("B");
        boolean actual = res.get(0).equals(res2.get(0));
        assertEquals(false,actual);
    }
    @Test
    public void test_for_set_length_is_same() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Swamiji", 3);
        Set<Person> set = new HashSet<Person>();
        set.add(swamiji);
        set.add(kunal);
        assertEquals(1,set.size());
    }
    @Test
    public void test_for_set_length_is_different() throws Exception {
        Person swamiji = new Person("Swamiji", 3);
        Person kunal = new Person("Kunal", 3);
        Set<Person> set = new HashSet<Person>();
        set.add(swamiji);
        set.add(kunal);
        assertEquals(2,set.size());
    }


}
