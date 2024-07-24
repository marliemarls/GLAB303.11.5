import java.util.HashSet;

public class ExampleFour {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();

        //adding elements
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        //addition of duplicates
        hset.add("Apple");
        hset.add("Mango");

        //addition of null values

        hset.add(null);
        hset.add(null);

        for (String str: hset){
            System.out.println(" ---> " + str);
        }
    }
}
