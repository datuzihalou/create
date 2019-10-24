public class aba {

    public static void main(String[] args) {
        String a = "aabascd";
        String b = "aabacsd ";
        while (a.length() != 0 && b.length() != 0 && a.length() == b.length()) {
            String c = a.substring(0, 1);
            a = a.replace(c, "");
            b = b.replace(c, "");
        }
        if (a.length() == b.length() && a.length() == 0) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }

    }
}