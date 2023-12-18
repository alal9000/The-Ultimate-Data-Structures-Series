import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var str = "Orange";
        System.out.println(str.hashCode());


//        Map<String, String> map = new HashMap<>();
//        map.put("123456-A", "Mosh");
//        System.out.println(hash("123456-A"));

    }

    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }

}