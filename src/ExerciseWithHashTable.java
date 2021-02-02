import java.util.Hashtable;

public class ExerciseWithHashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable(hashtable);
    }

    private static void hashtable(Hashtable<Integer, String> hashtable) {
        System.out.println("----------------------------- Hashtable ----------------------------");
        System.out.println("\"Hashtable\" is unordered!");
        hashtable.put(7, "Cristiano Ronaldo");
        hashtable.put(10, "Leo Messi");
        hashtable.put(8, "Avi Nimni");
        hashtable.put(24, "Kobi Brian");
        PrintUtils.printHashtable(hashtable);
        System.out.println();
        // STEP 2 - set p3 name to "Moshe"
        System.out.println("Set the name of player number 8 to be \"Moshe\":");
        hashtable.replace(8, "Avi Nimni", "Moshe");
        // if you use "put" instead of "replace" it will work to!
        PrintUtils.printMap(hashtable);
        System.out.println();
        // STEP 3 - add p5 to the end of the list using using ADD method
        System.out.println("Add p5 to the end of the list using ADD method:");
        System.out.println("Not an option!");
        System.out.println();
        // STEP 4 - add p6 to position 3 the end of the list using ADD method
        System.out.println("Add p6 to position 3 the end of the list using ADD method:");
        System.out.println("Not an option, you can wright over it!");
        System.out.println();
        // STEP 5 - remove p2 from the list
        System.out.println("Remove p2 from the list and printing the list using a static method in a utility class:");
        hashtable.remove(10, "Leo Messi");
        PrintUtils.printMap(hashtable);
        System.out.println();

    }
}
