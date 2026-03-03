public class OOPSBanner6 {
	public static String[] getO() {
		return new String[]{
		"   ***   ",
		" **   ** ",
		"**     **",
		"**     **",
		"**     **",
		"**     **",
		"**     **",
		" **   ** ",
		"   ***   "};}
	public static String[] getP() {
		return new String[]{
		"   ***   ",
		" **   ** ",
		"**     **",
		"**     **",
		"**     **",
		"**     **",
		"**     **",
		" **   ** ",
		"   ***   "};}
	public static String[] getS() {
		return new String[]{
		"******   ",
		"**    ** ",
		"**     **",
		"**    ** ",
		"******   ",
		"**       ",
		"**       ",
		"**       ",
		"**       "};}
	public static String[] getQ() {
		return new String[]{
		"   ***** ",
		" **      ",
		"**       ",
		" **      ",
		"   ***   ",
		"      ** ",
		"       **",
		"      ** ",
		" *****   "};}
		public static void main(String[] args) {
        String[][] banner = { getO(), getP(), getS(), getQ() };

        for (int i = 0; i < 9; i++) { 
            for (String[] letter : banner) {
                System.out.print(letter[i] + "  "); // Space between letters
            }
			System.out.println();
		}
		}
}