import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CharacterFinder finder = new CharacterFinder();
        var ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);

    }

}