public class NonRepeater {
    public static void main(String[] args) {
        String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.lastIndexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First NonRepeated char" + ch);
                break;
            } else if (str.lastIndexOf(ch) == -1) {
                System.out.println("Character not found");
            }
        }
    }
}