import java.util.TreeMap;

public class Exercises {
   TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

   public void exercise1(TreeMap<String, Integer> treeMap)
   {
       System.out.println("1st exercise: Write a Java program to associate the specified value with the specified key in a Tree Map");
       treeMap.put("Fjord", 1);
       treeMap.put("Jester", 2);
       treeMap.put("Caleb", 3);
       System.out.println(treeMap);
       System.out.println();
   }

   public TreeMap<String, Integer> getTreeMap()
   {
       return treeMap;
   }
}
