import java.util.Random;

public class testCommon {
    public static void main(String[] args) {
        System.out.println(getRedom());
    }
    //生成四位验证码
    private static String getRedom() {
        String str = "0123456789";
        Random r = new Random();
        String arr[] = new String[4];
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int n = r.nextInt(10);
            arr[i] = str.substring(n, n + 1);
            b.append(arr[i]);

        }
        return b.toString();
    }
}
