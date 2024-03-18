import java.util.HashMap;

public class CharacterMapping {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";

        boolean isMappingPossible = isMappingPossible(str1, str2);
        System.out.println(isMappingPossible ? 1 : 0);
    }

    public static boolean isMappingPossible(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Character> mapping = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (mapping.containsKey(char1)) {
                if (mapping.get(char1) != char2)
                    return false; // If a character maps to different characters in str2, return false
            } else {
                if (mapping.containsValue(char2))
                    return false; // If a character in str2 is already mapped to another character, return false
                mapping.put(char1, char2); // Otherwise, add the mapping
            }
        }

        return true;
    }
}
