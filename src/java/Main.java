import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listFruits = new ArrayList<>();
        Set<String> fruits = new HashSet<>();

        listFruits.add("Apple");
        listFruits.add("Apple");

        fruits.add("Apple");
        fruits.add("Apple");

        for (String listFruit: listFruits) {
            System.out.println(listFruit);
        }

        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }
}