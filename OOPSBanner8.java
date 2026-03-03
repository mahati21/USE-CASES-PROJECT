import java.util.HashMap;
import java.util.Map;

public class OOPSBanner8 {

    private static final Map<Character, String[]> charPatterns = new HashMap<>();

    static {
        charPatterns.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        charPatterns.put('P', new String[]{
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        });
        charPatterns.put('S', new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            " **      ",
            "   ***   ",
            "      ** ",
            "       **",
            "      ** ",
            " *****   "
        });
    }

    public static void renderBanner(String word) {
        word = word.toUpperCase();
        int height = 8; 

        for (int i = 0; i < height; i++) {
            for (char c : word.toCharArray()) {
                String[] pattern = charPatterns.get(c);
                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                } else {
                   
                    System.out.print("        " + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        renderBanner("OOPS");  
    }
}