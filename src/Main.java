import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CharacterFinder finder = new CharacterFinder();
        var c = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(c);

    }

}