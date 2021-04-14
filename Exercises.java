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

    public TreeMap<String, Integer> getTreeMap()
    {
        return treeMap;
    }
}
