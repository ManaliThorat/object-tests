/**
 * Created by manalit on 1/14/14.
 */
import java.util.*;

public class MyComparator implements Comparable<MyComparator>{
    private String name;
    private int age;

    public MyComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComparator)) return false;

        MyComparator person = (MyComparator) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;

    }

    @Override
    public int compareTo(MyComparator o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
//
//class MyClass {
//    public static void main(String[] args) {
//        MyComparator swamiji = new MyComparator("Swamiji", 3);
//        MyComparator kunal = new MyComparator("Kunal", 50);
//        MyComparator digvijay = new MyComparator("Digvijay", 35);
//        List<MyComparator> people = addPeopleToList(digvijay, kunal, swamiji);
//
//        Collections.sort(people);
//        System.out.println(people);
//
//        Collections.sort(people, new Comparator<MyComparator>() {
//            @Override
//            public int compare(MyComparator p1, MyComparator p2) {
//                return p1.getName().length()-p2.getName().length();
//            }
//        });
//        System.out.println(people);
//
//    }
//    public static List addPeopleToList(MyComparator... persons){
//        List<MyComparator> people = new ArrayList<MyComparator>();
//        for (MyComparator person : persons) {
//            people.add(person);
//        }
//        return people;
//    }
//}