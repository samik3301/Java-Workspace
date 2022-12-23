/*
import java.util.Map;
import java.util.TreeMap;
public class DA2_Q3_20BRS1205 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1,"Samik");
        treeMap.put(2, "Aditya");
        treeMap.put(5, "Abdul");
        treeMap.put(4, "Abhinav");
        treeMap.put(3, "Aman");
        //printing using indexes
        System.out.println(treeMap.get(3));
        System.out.println(treeMap.get(4));
        System.out.println(treeMap.get(1));
        //iterating through and printing
        for(Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + "\tValue: "+ entry.getValue());
        }
    }
}
/*
TreeMap can be used when there is a need for traversing the map in sorted order. TreeMaps can be used while visualizing sales data and comparison of sales data, visualization and much more
 */



import java.util.TreeSet;
public class DA2_Q3_20BRS1205 {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);

        System.out.println("Set 1 contents: ");
        System.out.println(set1);
        System.out.println();
        System.out.println("Set 2 contents: ");
        System.out.println(set2);
        System.out.println();
        System.out.println("UNION: ");
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println("INTERSECTION: ");
        set2.retainAll(set1);
        System.out.println(set2);
    }
}
/*
TreeSet, similar to HashSet, stores data in a unique manner. Most of the methods for HashSet also work with TreeSet as they share the same interface as Set. The main difference between TreeSet and HashSet is that TreeSet stores the data in ascending order.
 */