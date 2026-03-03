public class OOPSBanner7 {
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {
        private static CharacterPattern[] patterns = {
            new CharacterPattern('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
            }),
            new CharacterPattern('P', new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
            }),
            new CharacterPattern('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
            })
        };
		
        public static String[] getPattern(char c) {
            for (CharacterPattern cp : patterns) {
                if (cp.getCharacter() == c) {
                    return cp.getPattern();
                }
            }
            return new String[]{" "}; // Default for unknown characters
        }
    }

    public static void displayBanner(String word) {
        StringBuilder[] outputLines = new StringBuilder[9];
        for (int i = 0; i < 9; i++) {
            outputLines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            String[] pattern = CharacterPatternMap.getPattern(c);
            for (int i = 0; i < 9; i++) {
                outputLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : outputLines) {
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        String word = "OOPS";
        displayBanner(word);
    }
}