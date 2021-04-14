import java.util.TreeMap;
import java.util.Map;

public class Exercises {
    TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

    public void exercise1(TreeMap<String, Integer> treeMap, int selector)
    {
        System.out.println("1st exercise: Write a Java program to associate the specified value with the specified key in a Tree Map");
        if(selector == 1){
            treeMap.put("Fjord", 1);
            treeMap.put("Jester", 2);
            treeMap.put("Caleb", 3);
        }else if(selector ==  2){
            treeMap.put("Veth", 4);
            treeMap.put("Yahsa", 5);
            treeMap.put("Caduceus", 6);
            treeMap.put("Beauregard", 7);
        }
       
        System.out.println(treeMap);
        System.out.println();
    }

    public void exercise2(TreeMap<String, Integer> treeMap1, TreeMap<String, Integer> treeMap2)
    {
        System.out.println("2nd exercise: Write a Java program to copy a Tree Map content to another Tree Map");
        System.out.println("1st map: " + treeMap1);
        System.out.println("2nd map: " + treeMap2);
        treeMap2 = (TreeMap<String, Integer>) treeMap1.clone();
        System.out.println("2nd map after copying: " + treeMap2);
        System.out.println();
    }

    public void exercise3(TreeMap<String, Integer> treeMap, String key)
    {
        System.out.println("3rd exercise: Write a Java program to search a key in a Tree Map");
        System.out.println(treeMap);
        System.out.println("I will be looking for this key: " + key);
        if(treeMap.containsKey(key)){
            System.out.println("The map contains the key");
        }else{
            System.out.println("The map does not contain the key");
        }
        System.out.println();
    }

    public void exercise4(TreeMap<String, Integer> treeMap, int value)
    {
        System.out.println("3rd exercise: Write a Java program to search a value in a Tree Map");
        System.out.println(treeMap);
        System.out.println("I will be looking for this value: " + value);
        if(treeMap.containsValue(value)){
            System.out.println("The map contains the value");
        }else{
            System.out.println("The map does not contain the value");
        }
        System.out.println();
    }

    public void exercise5(TreeMap<String, Integer> treeMap)
    {
        System.out.println("5th exercise: Write a Java program to get all keys from the given a Tree Map");
        System.out.println(treeMap);
        System.out.println("The keys are: ");
        for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println();
    }

    public void exercise6(TreeMap<String, Integer> treeMap)
    {
        System.out.println("6th exercise: Write a Java program to delete all elements from a given Tree Map");
        System.out.println(treeMap);
        treeMap.clear();
        System.out.println("After deleting the elements: " + treeMap);
        System.out.println();
    }

    /*public void exercise7()
    {
        System.out.println("7th exercise: Write a Java program to sort keys in Tree Map by using comparator");
        System.out.println();
        System.out.println();
    }*/

    public void exercise8(TreeMap<String, Integer> treeMap)
    {
        System.out.println("8th exercise: Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map");
        System.out.println(treeMap);
        System.out.println("Greates key: " + treeMap.firstEntry());
        System.out.println("Least key: " + treeMap.lastEntry());
        System.out.println();
    }

    public void exercise9(TreeMap<String, Integer> treeMap)
    {
        System.out.println("9th exercise: Write a Java program to get the first (lowest) key and the last (highest) key currently in a map");
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println();
    }

    public void exercise10(TreeMap<String, Integer> treeMap)
    {
        System.out.println("10th exercise: Write a Java program to get a reverse order view of the keys contained in a given map");
        System.out.println(treeMap);
        System.out.println("Reversed order of the keys: " + treeMap.descendingKeySet());
        System.out.println();
    }

    public void exercise11(TreeMap<String, Integer> treeMap)
    {
        System.out.println("11th exercise: Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key");
        System.out.println(treeMap);
        System.out.println(treeMap.floorEntry("Veth"));
        System.out.println();
    }

    public void exercise12(TreeMap<String, Integer> treeMap)
    {
        System.out.println("12th exercise: Write a Java program to get the greatest key less than or equal to the given key");
        System.out.println(treeMap);
        System.out.println(treeMap.floorKey("Yahsa"));
        System.out.println();
    }

    public void exercise13(TreeMap<String, Integer> treeMap)
    {
        System.out.println("13th exercise: Write a Java program to get the portion of a map whose keys are strictly less than a given key");
        System.out.println(treeMap);
        System.out.println("Checking the keys for Veth: " + treeMap.headMap("Veth"));
        System.out.println();
    }

    public void exercise14(TreeMap<String, Integer> treeMap)
    {
        System.out.println("14th exercise: Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key");
        System.out.println(treeMap);
        System.out.println("Checking the keys for Yahsa: " + treeMap.headMap("Yahsa", true));
        System.out.println();
    }

    public void exercise15(TreeMap<String, Integer> treeMap)
    {
        System.out.println("15th exercise: Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key");
        System.out.println(treeMap);
        System.out.println("Checking the keys for Caduceus: " + treeMap.higherKey("Caduceus"));
        System.out.println();
    }

    public void exercise16(TreeMap<String, Integer> treeMap)
    {
        System.out.println("16th exercise: Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key");
        System.out.println(treeMap);
        System.out.println("Checking the entries for Beauregard: " + treeMap.lowerEntry("Beauregard"));
        System.out.println();
    }

    public void exercise17(TreeMap<String, Integer> treeMap)
    {
        System.out.println("17th exercise: Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key");
        System.out.println(treeMap);
        System.out.println("Checking the entries for Caduceus: " + treeMap.lowerKey("Caduceus"));
        System.out.println();
    }

    public void exercise18(TreeMap<String, Integer> treeMap)
    {
        System.out.println("18th exercise: Write a Java program to get NavigableSet view of the keys contained in a map");
        System.out.println(treeMap);
        System.out.println(treeMap.navigableKeySet());
        System.out.println();
    }

    public void exercise19(TreeMap<String, Integer> treeMap)
    {
        System.out.println("19th exercise: Write a Java program to remove and get a key-value mapping associated with the least key in a map");
        System.out.println(treeMap);
        System.out.println("The least entry (which is now removed from the map): " + treeMap.pollFirstEntry());
        System.out.println(treeMap);
        System.out.println();
    }

    public void exercise20(TreeMap<String, Integer> treeMap)
    {
        System.out.println("20th exercise: Write a Java program to remove and get a key-value mapping associated with the greatest key in this map");
        System.out.println(treeMap);
        System.out.println("The greatest entry (which is now removed from the map): " + treeMap.pollLastEntry());
        System.out.println(treeMap);
        System.out.println();
        treeMap.put("Beauregard", 7); // need more elements for future exercises
        treeMap.put("Yahsa", 5);

    }

    public void exercise21(TreeMap<String, Integer> treeMap)
    {
        System.out.println("21st exercise: Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)");
        System.out.println(treeMap);
        System.out.println("The subMap between Caduceus and Yahsa: " + treeMap.subMap("Caduceus", "Yahsa"));
        System.out.println();
    }

    public void exercise22(TreeMap<String, Integer> treeMap)
    {
        System.out.println("22nd exercise: Write a Java program to get the portion of a map whose keys range from a given key to another key");
        System.out.println(treeMap);
        System.out.println("The subMap between Caduceus and Yahsa: " + treeMap.subMap("Caduceus", true, "Yahsa", true));
        System.out.println();
    }

    public void exercise23(TreeMap<String, Integer> treeMap)
    {
        System.out.println("23rd exercise: Write a Java program to get a portion of a map whose keys are greater than or equal to a given key");
        System.out.println(treeMap);
        System.out.println("Keys greater than or equal to Caduceus: " + treeMap.tailMap("Caduceus"));
        System.out.println();
    }

    public void exercise24(TreeMap<String, Integer> treeMap)
    {
        System.out.println("24th exercise: Write a Java program to get a portion of a map whose keys are greater than to a given key");
        System.out.println(treeMap);
        System.out.println("Keys greater than Caduceus: " + treeMap.tailMap("Caduceus", false));
        System.out.println();
    }

    public TreeMap<String, Integer> getTreeMap()
    {
        return treeMap;
    }
}
