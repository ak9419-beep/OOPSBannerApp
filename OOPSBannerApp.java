public class OOPSBannerApp {

    // ─── Static Inner Class ─────────────────────────────────────────────
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }
    // ─────────────────────────────────────────────────────────────────────

    public static void main(String[] args) {

        // ASCII patterns for characters
        CharacterPatternMap charO = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        CharacterPatternMap charP = new CharacterPatternMap('P', new String[]{
                " ******  ",
                "**    ** ",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       "
        });

        CharacterPatternMap charS = new CharacterPatternMap('S', new String[]{
                "  ****   ",
                " **      ",
                " **      ",
                "  ****   ",
                "     **  ",
                " **  **  ",
                "  ****   "
        });

        // Word: OOPS
        CharacterPatternMap[] word = {charO, charO, charP, charS};

        int rows = charO.getPattern().length;

        // Print banner
        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < word.length; j++) {
                line.append(word[j].getPattern()[i]);

                if (j < word.length - 1) {
                    line.append("   "); // space between characters
                }
            }

            System.out.println(line);
        }
    }
}