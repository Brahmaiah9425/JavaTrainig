public class PatternRev {
    public static void main(String[] args) {
        int A = 65;
		int totalChars = 6;
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
                System.out.print((char)A);
                A++;
			}
            System.out.println(" ");
        }
    }
}