import java.util.HashMap;
import java.util.Map;

public class CharacterFinder {
    public char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var c : chars)
            if (map.get(c) == 1)
                return c;

        return Character.MIN_VALUE;
    }
}
