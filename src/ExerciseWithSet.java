import java.time.LocalDate;
import java.util.*;

public class ExerciseWithSet {

    public static void main(String[] args) {

        // Create a List and initialize it
        Set<Person> hashSetSet = new HashSet<>();
        Set<Person> treeSetSet = new TreeSet<>();
        Set<Person> linkedHashSetSet = new LinkedHashSet<>();

        hashSetSet(hashSetSet);
        treeSetSet(treeSetSet);
        linkedHashSetSet(linkedHashSetSet);

    }

    public static void hashSetSet(Set<Person> hashSetSet) {
        Person p1 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        Person p2 = new Person(100, "Or", LocalDate.of(1990, 6, 21));
        Person p3 = new Person(105, "Meital", LocalDate.of(1995, 9, 6));
        Person p4 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("----------------------------- HashSet ----------------------------");
        System.out.println("To work with \"HaseSet\" we need to add \"Equals and HashCode\" to the Person Class!");
        //hashSetSet.add(p1);
        //hashSetSet.add(p2);
        //hashSetSet.add(p3);
        //hashSetSet.add(p4);
        hashSetSet.addAll(Arrays.asList(p1, p2, p3, p4));
        hashSetSet.forEach(System.out::println);
        System.out.println("Set size is: " + hashSetSet.stream().count());
        System.out.println("Set does not insert duplicates");
        System.out.println();
        // STEP 2 - set p3 name to "Moshe" using SET method
        System.out.println("Set p3 name to \"Moshe\" using SET method:");
        System.out.println("Set is not an option!");
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using ADD method:");
        Person p5 = new Person(114, "Barak", LocalDate.of(1992, 3, 26));
        hashSetSet.add(p5);
        hashSetSet.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using ADD method
        System.out.println("Add p6 to position 3 the end of the list using ADD method:");
        System.out.println("Add an object to position is not an option!");
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        hashSetSet.remove(p2);
        PrintUtils.printSet(hashSetSet);
        System.out.println();
    }

    public static void treeSetSet(Set<Person> treeSetSet) {
        Person p1 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        Person p2 = new Person(100, "Or", LocalDate.of(1990, 6, 21));
        Person p3 = new Person(105, "Meital", LocalDate.of(1995, 9, 6));
        Person p4 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("------------------------------ TreeSet -----------------------------");
        System.out.println("To work with \"TreeSet\" we need to add \"Equals and HashCode\" and \"Comparable\" to the Person Class!");
        // treeSetSet.add(p1);
        // treeSetSet.add(p2);
        // treeSetSet.add(p3);
        // treeSetSet.add(p4);
        treeSetSet.addAll(Arrays.asList(p1, p2, p3, p4));
        treeSetSet.forEach(System.out::println);
        System.out.println("Set size is: " + treeSetSet.stream().count());
        System.out.println("Set does not insert duplicates");
        System.out.println();
        // STEP 2 - set p3 name to "Moshe" using SET method
        System.out.println("Set p3 name to \"Moshe\" using SET method:");
        System.out.println("Set is not an option!");
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using ADD method:");
        Person p5 = new Person(114, "Barak", LocalDate.of(1992, 3, 26));
        treeSetSet.add(p5);
        treeSetSet.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using ADD method
        System.out.println("Add p6 to position 3 the end of the list using ADD method:");
        System.out.println("Add an object to position is not an option!");
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        treeSetSet.remove(p2);
        PrintUtils.printSet(treeSetSet);
        System.out.println();
    }

    public static void linkedHashSetSet(Set<Person> linkedHashSetSet) {
        Person p1 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        Person p2 = new Person(100, "Or", LocalDate.of(1990, 6, 21));
        Person p3 = new Person(105, "Meital", LocalDate.of(1995, 9, 6));
        Person p4 = new Person(111, "Leeon", LocalDate.of(1986, 2, 15));
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("---------------------------- LinkedHashSet ---------------------------");
        System.out.println("To work with \"LinkedHashSet\" we need to add \"Equals and HashCode\" to the Person Class!");
        System.out.println("\"LinkedHashSet\" is a Linked list with no duplicates!");
        // linkedHashSetSet.add(p1);
        // linkedHashSetSet.add(p2);
        // linkedHashSetSet.add(p3);
        // linkedHashSetSet.add(p4);
        linkedHashSetSet.addAll(Arrays.asList(p1, p2, p3, p4));
        linkedHashSetSet.forEach(System.out::println);
        System.out.println("Set size is: " + linkedHashSetSet.stream().count());
        System.out.println("Set does not insert duplicates");
        System.out.println();
        // STEP 2 - set p3 name to "Moshe" using SET method
        System.out.println("Set p3 name to \"Moshe\" using SET method:");
        System.out.println("Set is not an option!");
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using ADD method:");
        Person p5 = new Person(114, "Barak", LocalDate.of(1992, 3, 26));
        linkedHashSetSet.add(p5);
        linkedHashSetSet.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using ADD method
        System.out.println("Add p6 to position 3 the end of the list using ADD method:");
        System.out.println("Add an object to position is not an option!");
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        linkedHashSetSet.remove(p2);
        PrintUtils.printSet(linkedHashSetSet);
        System.out.println();
    }
}
