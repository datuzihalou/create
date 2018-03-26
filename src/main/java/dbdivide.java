public class dbdivide {
    public static void main(String[] args) {
        String pin="fdsafsa";
        int hash = pin.hashCode();
        int inx = Math.abs(hash) % 3;
        System.out.println("whhat" + "_" + hash);
        System.out.println("whhat" + "_" + Math.abs(hash));
        System.out.println("whhat" + "_" + inx);
    }
}
