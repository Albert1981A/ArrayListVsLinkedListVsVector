import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExerciseWithMap {

    public static void main(String[] args) {

        Map<Integer, String> mapHashMap = new HashMap<>();
        Map<Integer, String> treeMapMap = new TreeMap<>();
        Map<Integer, String> linkedHashMapMap = new LinkedHashMap<>();

        mapHashMap(mapHashMap);
        treeMapMap(treeMapMap);
        linkedHashMapMap(linkedHashMapMap);
    }

    public static void mapHashMap(Map<Integer, String> mapHashMap) {
        // STEP 1 - add 4 People: p1,p2,p3,p4
        System.out.println("----------------------------- HashMap ----------------------------");
        System.out.println("\"HashMap\" is unordered!");
        mapHashMap.put(7, "Cristiano Ronaldo");
        mapHashMap.put(10, "Leo Messi");
        mapHashMap.put(8, "Avi Nimni");
        mapHashMap.put(24, "Kobi Brian");
        PrintUtils.printMap(mapHashMap);
        System.out.println();
        // STEP 2 - set p3 name to "Moshe"
        System.out.println("Set the name of player number 8 to be \"Moshe\":");
        mapHashMap.replace(8, "Avi Nimni", "Moshe");
        // if you use "put" instead of "replace" it will work to!
        PrintUtils.printMap(mapHashMap);
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
        mapHashMap.remove(10, "Leo Messi");
        PrintUtils.printMap(mapHashMap);
        System.out.println();
    }

    private static void treeMapMap(Map<Integer, String> treeMapMap) {
        // STEP 1 - add 4 People: p1,p2,p3,p4
        System.out.println("----------------------------- TreeMap ----------------------------");
        System.out.println("To work with \"TreeMap\" we need to add \"Equals and HashCode\" and \"Comparable\" to the Person Class!");
        System.out.println("\"TreeMap\" is ordered by key");
        treeMapMap.put(7, "Cristiano Ronaldo");
        treeMapMap.put(10, "Leo Messi");
        treeMapMap.put(8, "Avi Nimni");
        treeMapMap.put(24, "Kobi Brian");
        PrintUtils.printMap(treeMapMap);
        System.out.println();
        // STEP 2 - set p3 name to "Moshe"
        System.out.println("Set the name of player number 8 to be \"Moshe\":");
        treeMapMap.replace(8, "Avi Nimni", "Moshe");
        // if you use "put" instead of "replace" it will work to!
        PrintUtils.printMap(treeMapMap);
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
        treeMapMap.remove(10, "Leo Messi");
        PrintUtils.printMap(treeMapMap);
        System.out.println();
    }

    private static void linkedHashMapMap(Map<Integer, String> linkedHashMapMap) {
        // STEP 1 - add 4 People: p1,p2,p3,p4
        System.out.println("----------------------------- LinkedHashMap ----------------------------");
        System.out.println("\"TreeMap\" is ordered by entry");
        linkedHashMapMap.put(7, "Cristiano Ronaldo");
        linkedHashMapMap.put(10, "Leo Messi");
        linkedHashMapMap.put(8, "Avi Nimni");
        linkedHashMapMap.put(24, "Kobi Brian");
        PrintUtils.printMap(linkedHashMapMap);
        System.out.println();
        // STEP 2 - set p3 name to "Moshe"
        System.out.println("Set the name of player number 8 to be \"Moshe\":");
        linkedHashMapMap.replace(8, "Avi Nimni", "Moshe");
        // if you use "put" instead of "replace" it will work to!
        PrintUtils.printMap(linkedHashMapMap);
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
        linkedHashMapMap.remove(10, "Leo Messi");
        PrintUtils.printMap(linkedHashMapMap);
        System.out.println();
    }
}
