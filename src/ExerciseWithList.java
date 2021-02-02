import java.util.*;

public class ExerciseWithList {

    public static void main(String[] args) {

        // Create a List and initialize it
        List<Person> arrList = new ArrayList<>();
        List<Person> linkedList = new LinkedList<>();
        List<Person> vectorList = new Vector<>();
        Stack<Person> stackList = new Stack<>();

        arrList(arrList);
        linkedList(linkedList);
        vectorList(vectorList);
        stackList(stackList);
    }

    public static void arrList(List<Person> arrList) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("---------------------------- ArrayList ---------------------------");
//        arrList.add(p1);
//        arrList.add(p2);
//        arrList.add(p3);
//        arrList.add(p4);
        arrList.addAll(Arrays.asList(p1, p2, p3, p4));
        arrList.forEach(System.out::println);
        System.out.println();
        // STEP 2 - set p4 name to "Moshe" using SET method
        System.out.println("Set p4 name to \"Moshe\" using SET method:");
        p4.setName("Moshe");
        arrList.set(3, p4);
        arrList.forEach(System.out::println);
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using using ADD method:");
        Person p5 = new Person();
        arrList.add(p5);
        arrList.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using using ADD method
        System.out.println("Add p6 to position 3 the end of the list using using ADD method:");
        Person p6 = new Person();
        arrList.add(3, p6);
        arrList.forEach(System.out::println);
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        arrList.remove(p2);
        PrintUtils.printList(arrList);
        System.out.println();
    }

    public static void linkedList(List<Person> linkedList) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("---------------------------- LinkedList ---------------------------");
//        linkedList.add(p1);
//        linkedList.add(p2);
//        linkedList.add(p3);
//        linkedList.add(p4);
        linkedList.addAll(Arrays.asList(p1, p2, p3, p4));
        linkedList.forEach(System.out::println);
        System.out.println();
        // STEP 2 - set p4 name to "Moshe" using SET method
        System.out.println("Set p4 name to \"Moshe\" using SET method:");
        p4.setName("Moshe");
        linkedList.set(3, p4);
        linkedList.forEach(System.out::println);
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using using ADD method:");
        Person p5 = new Person();
        linkedList.add(p5);
        linkedList.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using using ADD method
        System.out.println("Add p6 to position 3 the end of the list using using ADD method:");
        Person p6 = new Person();
        linkedList.add(3, p6);
        linkedList.forEach(System.out::println);
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        linkedList.remove(p2);
        PrintUtils.printList(linkedList);
        System.out.println();
    }

    public static void vectorList(List<Person> vectorList) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("------------------------------ Vector ------------------------------");
//        vectorList.add(p1);
//        vectorList.add(p2);
//        vectorList.add(p3);
//        vectorList.add(p4);
        vectorList.addAll(Arrays.asList(p1, p2, p3, p4));
        vectorList.forEach(System.out::println);
        System.out.println();
        // STEP 2 - set p4 name to "Moshe" using SET method
        System.out.println("Set p4 name to \"Moshe\" using SET method:");
        p4.setName("Moshe");
        vectorList.set(3, p4);
        vectorList.forEach(System.out::println);
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using using ADD method:");
        Person p5 = new Person();
        vectorList.add(p5);
        vectorList.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using using ADD method
        System.out.println("Add p6 to position 3 the end of the list using using ADD method:");
        Person p6 = new Person();
        vectorList.add(3, p6);
        vectorList.forEach(System.out::println);
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        vectorList.remove(p2);
        PrintUtils.printList(vectorList);
        System.out.println();
    }

    public static void stackList(Stack<Person> stackList) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        // STEP 1 - add 4 People: p1,p2,p3,p4 using ADDALL method
        System.out.println("------------------------------- Stuck ------------------------------");
//        stackList.push(p1);
//        stackList.push(p2);
//        stackList.push(p3);
//        stackList.push(p4);
        stackList.addAll(Arrays.asList(p1, p2, p3, p4));
        stackList.forEach(System.out::println);
        System.out.println();
        // STEP 2 - set p4 name to "Moshe" using SET method
        System.out.println("Set p4 name to \"Moshe\" using SET method:");
        p4.setName("Moshe");
        stackList.set(3, p4);
        stackList.forEach(System.out::println);
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using using ADD method:");
        Person p5 = new Person();
        stackList.push(p5);
        stackList.forEach(System.out::println);
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using using ADD method
        System.out.println("Add p6 to position 3 the end of the list using using ADD method:");
        Person p6 = new Person();
        stackList.add(3, p6);
        stackList.forEach(System.out::println);
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        stackList.remove(p2);
        PrintUtils.printList(stackList);
        System.out.println();
    }

}