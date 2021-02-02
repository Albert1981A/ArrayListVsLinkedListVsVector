import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class PrintUtils {
    public static void printList(List<Person> List) {
        for(Person person : List) {
            System.out.println(person);
        }
    }
    public static void printSet(Set<Person> set) {
        for(Person person : set) {
            System.out.println(person);
        }
    }
    public static void printMap(Map<Integer, String> map) {
        for(Map.Entry<Integer, String> pair : map.entrySet()) {
            System.out.println("Shirt Number: " + pair.getKey() + " - Player Name: " + pair.getValue());
        }
    }
    public static void printHashtable(Hashtable<Integer,String> hashtable) {
        for(Map.Entry<Integer, String> pair : hashtable.entrySet()) {
            System.out.println("Shirt Number: " + pair.getKey() + " - Player Name: " + pair.getValue());
        }
    }
}
