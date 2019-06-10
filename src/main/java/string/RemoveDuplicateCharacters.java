package string;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
    public static void main(String... args) {
        String s = "aakkmdak";
        s = removeDuplicateCharacters(s);
        System.out.println(s);
    }

    private static String removeDuplicateCharacters(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
