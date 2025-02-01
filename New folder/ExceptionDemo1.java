public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            throw new IOException("This is an IOException");
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}